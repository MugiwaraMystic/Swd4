Źžŗ¾   @   core/Subscription  java/lang/Object counter I subscriptionId user Lcore/User; website Lcore/Website; 	frequency Ljava/lang/String; communicationChannel notifications Ljava/util/List; 	Signature %Ljava/util/List<Lcore/Notification;>; updateChecker Lservice/UpdateChecker; <clinit> ()V Code	     LineNumberTable LocalVariableTable <init> @(Lcore/User;Lcore/Website;Ljava/lang/String;Ljava/lang/String;)V
    	  !  	  #  		  % 
 	  '  	  )   + java/util/ArrayList
 * 	  .   0 service/UpdateChecker
 / 	  3   5 core/Notification
 4 7  8 (Lcore/Subscription;)V
 / : ; < addObserver (Lobserver/Observer;)V > @ ? java/util/List A B add (Ljava/lang/Object;)Z this Lcore/Subscription; notification Lcore/Notification; checkForUpdates
 I K J core/Website L M getUrl ()Ljava/lang/String;
 / O G P (Ljava/lang/String;)Z modifySubscription '(Ljava/lang/String;Ljava/lang/String;)V	 T V U java/lang/System W X out Ljava/io/PrintStream;   Z [ \ makeConcatWithConstants 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
 ^ ` _ java/io/PrintStream a b println (Ljava/lang/String;)V newFrequency newCommunicationChannel getSubscriptionId ()I setSubscriptionId (I)V getUser ()Lcore/User; setUser (Lcore/User;)V 
getWebsite ()Lcore/Website; 
setWebsite (Lcore/Website;)V getFrequency setFrequency getCommunicationChannel setCommunicationChannel getNotifications ()Ljava/util/List; '()Ljava/util/List<Lcore/Notification;>; setNotifications (Ljava/util/List;)V ((Ljava/util/List<Lcore/Notification;>;)V LocalVariableTypeTable 
SourceFile Subscription.java BootstrapMethods
    $java/lang/invoke/StringConcatFactory [  (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;   ?Subscription modified: Frequency - , Communication Channel -  InnerClasses  %java/lang/invoke/MethodHandles$Lookup  java/lang/invoke/MethodHandles Lookup !      
            	    
                                    %      ³ ±           
              ä     \*· *² Y`³ µ  *+µ "*,µ $*-µ &*µ (*» *Y· ,µ -*» /Y· 1µ 2» 4Y*· 6:*“ 2¶ 9*“ -¹ = W±       2                &  1  <  F  O  [      >    \ C D     \  	    \ 
     \      \    F  E F   G      >     *“ 2*“ $¶ H¶ NW±       
    #  $         C D    Q R     b     *+µ &*,µ (² S+,ŗ Y  ¶ ]±           '  ( 
 )  *          C D      c      d    e f     /     *“  ¬           .         C D    g h     >     *µ  ±       
    2  3         C D          i j     /     *“ "°           6         C D    k l     >     *+µ "±       
    :  ;         C D       	   m n     /     *“ $°           >         C D    o p     >     *+µ $±       
    B  C         C D      
    q M     /     *“ &°           F         C D    r b     >     *+µ &±       
    J  K         C D          s M     /     *“ (°           N         C D    t b     >     *+µ (±       
    R  S         C D          u v      w    /     *“ -°           V         C D    x y      z    P     *+µ -±       
    Z  [         C D         {            |    } ~           
     