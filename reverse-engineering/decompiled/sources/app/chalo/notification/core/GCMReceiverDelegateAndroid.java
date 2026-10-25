package app.chalo.notification.core;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import app.chalo.R;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.network.config.ChaloJson;
import app.chalo.notification.models.NotificationDisplayData;
import app.chalo.notification.models.NotificationNavigationData;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.SplashArgs;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import com.mmk.kmpnotifier.di.LibDependencyInitializer;
import com.mmk.kmpnotifier.di.Platform;
import com.mmk.kmpnotifier.di.PlatformModule_androidKt;
import com.mmk.kmpnotifier.notification.NotifierManagerImpl;
import com.mmk.kmpnotifier.notification.PushNotifier;
import com.mmk.kmpnotifier.notification.configuration.NotificationPlatformConfiguration;
import com.mmk.kmpnotifier.permission.PermissionUtil;
import defpackage.i71;
import defpackage.mb1;
import defpackage.n4;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.module.Module;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/notification/core/GCMReceiverDelegateAndroid;", "Lapp/chalo/notification/core/GCMReceiverDelegate;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GCMReceiverDelegateAndroid implements GCMReceiverDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6524a;
    public final IsNotificationPermissionGrantedUseCase b;
    public final CrashlyticsLogger c;
    public final Lazy d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/notification/core/GCMReceiverDelegateAndroid$Companion;", "", "", "CHANNEL_ID_MY_CHANNEL", "Ljava/lang/String;", "CHANNEL_NAME_NEW_GROUP", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public GCMReceiverDelegateAndroid(Context context, IsNotificationPermissionGrantedUseCase isNotificationPermissionGrantedUseCase, CrashlyticsLogger crashlyticsLogger, Lazy lazy) {
        this.f6524a = context;
        this.b = isNotificationPermissionGrantedUseCase;
        this.c = crashlyticsLogger;
        this.d = lazy;
    }

    @Override // app.chalo.notification.core.GCMReceiverDelegate
    public final void a() throws DefinitionOverrideException, ClosedScopeException {
        NotificationPlatformConfiguration.Android android2 = new NotificationPlatformConfiguration.Android(R.drawable.logo_notification);
        NotifierManagerImpl notifierManagerImpl = NotifierManagerImpl.f15315a;
        if (LibDependencyInitializer.f15302a != null) {
            return;
        }
        Module module = new Module();
        new KoinDefinition(module, i71.m(new BeanDefinition(ScopeRegistry.e, Reflection.a(NotificationPlatformConfiguration.class), null, new n4(android2, 25), Kind.Singleton, EmptyList.f17557a), module));
        KoinApplication koinApplication = new KoinApplication();
        Module module2 = PlatformModule_androidKt.b;
        Intrinsics.i(module2, "module");
        koinApplication.a(CollectionsKt.S(module, module2));
        Koin koin = koinApplication.f18816a;
        koin.b();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Scope scope = koin.c.d;
        Lazy lazyA = LazyKt.a(lazyThreadSafetyMode, new Function0<PermissionUtil>() { // from class: com.mmk.kmpnotifier.di.LibDependencyInitializerKt$onLibraryInitialized$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return scope.d(Reflection.a(PermissionUtil.class), null, null);
            }
        });
        ScopeRegistry scopeRegistry = koin.c;
        final Scope scope2 = scopeRegistry.d;
        Lazy lazyA2 = LazyKt.a(lazyThreadSafetyMode, new Function0<Platform>() { // from class: com.mmk.kmpnotifier.di.LibDependencyInitializerKt$onLibraryInitialized$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return scope2.d(Reflection.a(Platform.class), null, null);
            }
        });
        final Scope scope3 = scopeRegistry.d;
        Lazy lazyA3 = LazyKt.a(lazyThreadSafetyMode, new Function0<NotificationPlatformConfiguration>() { // from class: com.mmk.kmpnotifier.di.LibDependencyInitializerKt$onLibraryInitialized$$inlined$inject$default$3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return scope3.d(Reflection.a(NotificationPlatformConfiguration.class), null, null);
            }
        });
        scope3.d(Reflection.a(PushNotifier.class), null, null);
        Platform platform = (Platform) lazyA2.getValue();
        if (!Intrinsics.d(platform, Platform.Android.f15306a) && !Intrinsics.d(platform, Platform.Desktop.f15307a)) {
            if (Intrinsics.d(platform, Platform.Ios.f15308a)) {
                NotificationPlatformConfiguration notificationPlatformConfiguration = (NotificationPlatformConfiguration) lazyA3.getValue();
                if ((notificationPlatformConfiguration instanceof NotificationPlatformConfiguration.Ios ? (NotificationPlatformConfiguration.Ios) notificationPlatformConfiguration : null) == null) {
                    ((PermissionUtil) lazyA.getValue()).b(new mb1(13));
                }
            } else {
                if (!Intrinsics.d(platform, Platform.Web.f15309a)) {
                    throw new NoWhenBranchMatchedException();
                }
                NotificationPlatformConfiguration notificationPlatformConfiguration2 = (NotificationPlatformConfiguration) lazyA3.getValue();
                if ((notificationPlatformConfiguration2 instanceof NotificationPlatformConfiguration.Web ? (NotificationPlatformConfiguration.Web) notificationPlatformConfiguration2 : null) == null) {
                    ((PermissionUtil) lazyA.getValue()).b(new mb1(13));
                }
            }
        }
        LibDependencyInitializer.f15302a = koinApplication;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.notification.core.GCMReceiverDelegate
    public final Object b(NotificationDisplayData notificationDisplayData, ContinuationImpl continuationImpl) {
        GCMReceiverDelegateAndroid$postNotification$1 gCMReceiverDelegateAndroid$postNotification$1;
        String str;
        String str2;
        if (continuationImpl instanceof GCMReceiverDelegateAndroid$postNotification$1) {
            gCMReceiverDelegateAndroid$postNotification$1 = (GCMReceiverDelegateAndroid$postNotification$1) continuationImpl;
            int i = gCMReceiverDelegateAndroid$postNotification$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gCMReceiverDelegateAndroid$postNotification$1.label = i - Integer.MIN_VALUE;
            } else {
                gCMReceiverDelegateAndroid$postNotification$1 = new GCMReceiverDelegateAndroid$postNotification$1(this, continuationImpl);
            }
        } else {
            gCMReceiverDelegateAndroid$postNotification$1 = new GCMReceiverDelegateAndroid$postNotification$1(this, continuationImpl);
        }
        Object objC = gCMReceiverDelegateAndroid$postNotification$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = gCMReceiverDelegateAndroid$postNotification$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            gCMReceiverDelegateAndroid$postNotification$1.L$0 = notificationDisplayData;
            gCMReceiverDelegateAndroid$postNotification$1.label = 1;
            objC = c(gCMReceiverDelegateAndroid$postNotification$1);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            notificationDisplayData = (NotificationDisplayData) gCMReceiverDelegateAndroid$postNotification$1.L$0;
            ResultKt.b(objC);
        }
        if (((Boolean) objC).booleanValue() && (str = notificationDisplayData.d) != null && (str2 = notificationDisplayData.e) != null) {
            int i3 = notificationDisplayData.f6548a;
            Context context = this.f6524a;
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
                launchIntentForPackage.setClassName(context.getPackageName(), "app.chalo.android.MainActivity");
            }
            launchIntentForPackage.addFlags(335544320);
            NotificationNavigationData notificationNavigationData = notificationDisplayData.c;
            try {
                if (notificationNavigationData instanceof NotificationNavigationData.Deeplink) {
                    launchIntentForPackage.setData(Uri.parse("chalo://book/bookPass?source=notification"));
                } else {
                    if (!(notificationNavigationData instanceof NotificationNavigationData.TaskStack)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Json json = ChaloJson.b;
                    List list = ((NotificationNavigationData.TaskStack) notificationNavigationData).f6549a;
                    json.getClass();
                    launchIntentForPackage.putExtra("notification_payload_meta_data", json.a(new ArrayListSerializer(SceneArgs.INSTANCE.serializer()), list));
                }
            } catch (Exception e) {
                this.c.i(e);
                SplashArgs splashArgs = SplashArgs.INSTANCE;
                List listR = CollectionsKt.R(splashArgs);
                Json json2 = ChaloJson.b;
                json2.getClass();
                launchIntentForPackage.putExtra("notification_payload_meta_data", json2.a(new ArrayListSerializer(splashArgs.serializer()), listR));
            }
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            launchIntentForPackage.setFlags(268468224);
            PendingIntent activity = PendingIntent.getActivity(context, iCurrentTimeMillis, launchIntentForPackage, 335544320);
            int i4 = R.drawable.logo_notification;
            Intrinsics.f(activity);
            Notification notificationBuild = new NotificationCompat.Builder(context, "myChannel").setSmallIcon(i4).setColor(ContextCompat.getColor(context, R.color.orange_primary)).setTicker(str2).setWhen(System.currentTimeMillis()).setContentTitle(str).setContentText(str2).setContentIntent(activity).setAutoCancel(true).setStyle(new NotificationCompat.BigTextStyle().bigText(str2)).build();
            notificationBuild.flags |= 16;
            Object systemService = context.getSystemService("notification");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel("myChannel", "NewGroup", 4));
            }
            notificationManager.notify(i3, notificationBuild);
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r6 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof app.chalo.notification.core.GCMReceiverDelegateAndroid$canPostNotification$1
            if (r0 == 0) goto L13
            r0 = r6
            app.chalo.notification.core.GCMReceiverDelegateAndroid$canPostNotification$1 r0 = (app.chalo.notification.core.GCMReceiverDelegateAndroid$canPostNotification$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.notification.core.GCMReceiverDelegateAndroid$canPostNotification$1 r0 = new app.chalo.notification.core.GCMReceiverDelegateAndroid$canPostNotification$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r6)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.ResultKt.b(r6)
            goto L44
        L36:
            kotlin.ResultKt.b(r6)
            r0.label = r4
            app.chalo.usecase.IsNotificationPermissionGrantedUseCase r6 = r5.b
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L44
            goto L5c
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L66
            kotlin.Lazy r6 = r5.d
            java.lang.Object r6 = r6.getValue()
            app.chalo.helper.MandatoryFirstHistoryCallGuard r6 = (app.chalo.helper.MandatoryFirstHistoryCallGuard) r6
            r0.label = r3
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L66
            goto L67
        L66:
            r4 = 0
        L67:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.notification.core.GCMReceiverDelegateAndroid.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
