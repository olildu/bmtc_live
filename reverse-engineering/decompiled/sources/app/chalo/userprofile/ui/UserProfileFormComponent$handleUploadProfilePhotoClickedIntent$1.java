package app.chalo.userprofile.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.PermissionState;
import app.chalo.permissions.models.PermissionStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.userprofile.ui.UserProfileFormComponent$handleUploadProfilePhotoClickedIntent$1", f = "UserProfileFormComponent.kt", l = {187}, m = "invokeSuspend", v = 1)
final class UserProfileFormComponent$handleUploadProfilePhotoClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UserProfileFormComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileFormComponent$handleUploadProfilePhotoClickedIntent$1(UserProfileFormComponent userProfileFormComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userProfileFormComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfileFormComponent$handleUploadProfilePhotoClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileFormComponent$handleUploadProfilePhotoClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job job;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            AnalyticsContractImplKt.b(this.this$0.k, "user profile form photo clicked", Source.USER_PROFILE_FORM, null, false, 28);
            PermissionHandler permissionHandlerC = this.this$0.n.c();
            if (permissionHandlerC != null) {
                AppPermission appPermission = AppPermission.CAMERA;
                this.label = 1;
                obj = permissionHandlerC.b(appPermission, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                UserProfileFormComponent userProfileFormComponent = this.this$0;
                job = userProfileFormComponent.z;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                userProfileFormComponent.z = BuildersKt.d(userProfileFormComponent.j, null, null, new UserProfileFormComponent$requestCameraPermission$1(userProfileFormComponent, null), 3);
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        PermissionState permissionState = (PermissionState) obj;
        if (permissionState == null || !PermissionStateKt.a(permissionState)) {
            UserProfileFormComponent userProfileFormComponent2 = this.this$0;
            job = userProfileFormComponent2.z;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            userProfileFormComponent2.z = BuildersKt.d(userProfileFormComponent2.j, null, null, new UserProfileFormComponent$requestCameraPermission$1(userProfileFormComponent2, null), 3);
        } else {
            UserProfileFormComponent userProfileFormComponent3 = this.this$0;
            BuildersKt.d(userProfileFormComponent3.j, null, null, new UserProfileFormComponent$pickImage$1(userProfileFormComponent3, null), 3);
        }
        return Unit.f17538a;
    }
}
