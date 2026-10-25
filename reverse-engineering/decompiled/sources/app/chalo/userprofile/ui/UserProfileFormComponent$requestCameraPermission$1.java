package app.chalo.userprofile.ui;

import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.PermissionState;
import defpackage.vm1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.userprofile.ui.UserProfileFormComponent$requestCameraPermission$1", f = "UserProfileFormComponent.kt", l = {210}, m = "invokeSuspend", v = 1)
final class UserProfileFormComponent$requestCameraPermission$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UserProfileFormComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileFormComponent$requestCameraPermission$1(UserProfileFormComponent userProfileFormComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userProfileFormComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfileFormComponent$requestCameraPermission$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileFormComponent$requestCameraPermission$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PermissionHandler permissionHandlerC = this.this$0.n.c();
            if (permissionHandlerC != null) {
                ChannelFlowTransformLatest channelFlowTransformLatestC = permissionHandlerC.c(AppPermission.CAMERA);
                final UserProfileFormComponent userProfileFormComponent = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.userprofile.ui.UserProfileFormComponent$requestCameraPermission$1.1

                    /* JADX INFO: renamed from: app.chalo.userprofile.ui.UserProfileFormComponent$requestCameraPermission$1$1$WhenMappings */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final /* synthetic */ class WhenMappings {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final /* synthetic */ int[] f10348a;

                        static {
                            int[] iArr = new int[PermissionState.values().length];
                            try {
                                iArr[PermissionState.GRANTED.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[PermissionState.DENIED.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[PermissionState.REQUIRES_EXPLANATION.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[PermissionState.NOT_DETERMINED.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[PermissionState.UNKNOWN.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            f10348a = iArr;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        int i2 = WhenMappings.f10348a[((PermissionState) obj2).ordinal()];
                        UserProfileFormComponent userProfileFormComponent2 = userProfileFormComponent;
                        if (i2 == 1) {
                            BuildersKt.d(userProfileFormComponent2.j, null, null, new UserProfileFormComponent$pickImage$1(userProfileFormComponent2, null), 3);
                        } else if (i2 == 2 || i2 == 3) {
                            userProfileFormComponent2.E0(new vm1(29));
                        } else if (i2 != 4 && i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (channelFlowTransformLatestC.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
