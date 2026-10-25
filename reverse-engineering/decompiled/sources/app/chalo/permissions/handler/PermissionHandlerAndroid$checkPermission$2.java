package app.chalo.permissions.handler;

import android.os.Build;
import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.PermissionState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/permissions/models/PermissionState;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.permissions.handler.PermissionHandlerAndroid$checkPermission$2", f = "PermissionHandler.android.kt", l = {72}, m = "invokeSuspend", v = 1)
final class PermissionHandlerAndroid$checkPermission$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PermissionState>, Object> {
    final /* synthetic */ AppPermission $permission;
    int label;
    final /* synthetic */ PermissionHandlerAndroid this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6824a;

        static {
            int[] iArr = new int[AppPermission.values().length];
            try {
                iArr[AppPermission.POST_NOTIFICATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppPermission.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppPermission.COARSE_LOCATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppPermission.FINE_LOCATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AppPermission.READ_SMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AppPermission.SEND_SMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AppPermission.RECEIVE_SMS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AppPermission.READ_PHONE_STATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AppPermission.BLUETOOTH_SCAN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AppPermission.BLUETOOTH_CONNECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AppPermission.BLUETOOTH_ADVERTISE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AppPermission.APP_TRACKING_TRANSPARENCY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f6824a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionHandlerAndroid$checkPermission$2(PermissionHandlerAndroid permissionHandlerAndroid, AppPermission appPermission, Continuation continuation) {
        super(2, continuation);
        this.$permission = appPermission;
        this.this$0 = permissionHandlerAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PermissionHandlerAndroid$checkPermission$2(this.this$0, this.$permission, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PermissionHandlerAndroid$checkPermission$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            switch (WhenMappings.f6824a[this.$permission.ordinal()]) {
                case 1:
                    PermissionHandlerAndroid permissionHandlerAndroid = this.this$0;
                    permissionHandlerAndroid.getClass();
                    return Build.VERSION.SDK_INT >= 33 ? permissionHandlerAndroid.d(AppPermission.POST_NOTIFICATIONS) : PermissionState.GRANTED;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return this.this$0.d(this.$permission);
                case 9:
                case 10:
                case 11:
                    PermissionHandlerAndroid permissionHandlerAndroid2 = this.this$0;
                    AppPermission appPermission = this.$permission;
                    this.label = 1;
                    if (Build.VERSION.SDK_INT >= 31) {
                        obj = permissionHandlerAndroid2.d(appPermission);
                    } else {
                        permissionHandlerAndroid2.getClass();
                        obj = PermissionState.GRANTED;
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    break;
                case 12:
                    return PermissionState.GRANTED;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return (PermissionState) obj;
    }
}
