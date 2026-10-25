package app.chalo.userprofile.ui.minprofileupdate;

import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.PermissionState;
import app.chalo.permissions.models.PermissionStateKt;
import com.google.android.gms.wallet.WalletConstants;
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
@DebugMetadata(c = "app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent$handleUploadProfilePhotoClickedIntent$1", f = "MinProfileUpdateComponent.kt", l = {WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE}, m = "invokeSuspend", v = 1)
final class MinProfileUpdateComponent$handleUploadProfilePhotoClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MinProfileUpdateComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinProfileUpdateComponent$handleUploadProfilePhotoClickedIntent$1(MinProfileUpdateComponent minProfileUpdateComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = minProfileUpdateComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MinProfileUpdateComponent$handleUploadProfilePhotoClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MinProfileUpdateComponent$handleUploadProfilePhotoClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job job;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PermissionHandler permissionHandlerC = this.this$0.n.c();
            if (permissionHandlerC != null) {
                AppPermission appPermission = AppPermission.CAMERA;
                this.label = 1;
                obj = permissionHandlerC.b(appPermission, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                MinProfileUpdateComponent minProfileUpdateComponent = this.this$0;
                job = minProfileUpdateComponent.B;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                minProfileUpdateComponent.B = BuildersKt.d(minProfileUpdateComponent.j, null, null, new MinProfileUpdateComponent$requestCameraPermission$1(minProfileUpdateComponent, null), 3);
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        PermissionState permissionState = (PermissionState) obj;
        if (permissionState == null || !PermissionStateKt.a(permissionState)) {
            MinProfileUpdateComponent minProfileUpdateComponent2 = this.this$0;
            job = minProfileUpdateComponent2.B;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            minProfileUpdateComponent2.B = BuildersKt.d(minProfileUpdateComponent2.j, null, null, new MinProfileUpdateComponent$requestCameraPermission$1(minProfileUpdateComponent2, null), 3);
        } else {
            MinProfileUpdateComponent minProfileUpdateComponent3 = this.this$0;
            BuildersKt.d(minProfileUpdateComponent3.j, null, null, new MinProfileUpdateComponent$pickImage$1(minProfileUpdateComponent3, null), 3);
        }
        return Unit.f17538a;
    }
}
