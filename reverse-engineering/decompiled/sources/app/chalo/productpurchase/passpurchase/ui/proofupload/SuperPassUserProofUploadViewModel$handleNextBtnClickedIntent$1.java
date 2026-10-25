package app.chalo.productpurchase.passpurchase.ui.proofupload;

import app.chalo.fileupload.picker.ImagePicker;
import app.chalo.fileupload.picker.ImagePickerConfig;
import app.chalo.fileupload.picker.ImagePickerHelperKt;
import app.chalo.fileupload.picker.ImagePickerResult;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.PermissionState;
import app.chalo.superpass.data.models.app.ProofDocumentProps;
import app.chalo.utils.KUUID;
import app.chalo.utils.PlatformFeature;
import defpackage.gf;
import defpackage.l91;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadViewModel$handleNextBtnClickedIntent$1", f = "SuperPassUserProofUploadViewModel.kt", l = {141}, m = "invokeSuspend", v = 1)
public final class SuperPassUserProofUploadViewModel$handleNextBtnClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImagePicker $imagePicker;
    final /* synthetic */ PermissionHandler $permissionHandler;
    final /* synthetic */ ProofDocumentProps $proofDocumentProps;
    int label;
    final /* synthetic */ SuperPassUserProofUploadViewModel this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8512a;

        static {
            int[] iArr = new int[PermissionState.values().length];
            try {
                iArr[PermissionState.DENIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionState.REQUIRES_EXPLANATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionState.NOT_DETERMINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PermissionState.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PermissionState.GRANTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f8512a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassUserProofUploadViewModel$handleNextBtnClickedIntent$1(ImagePicker imagePicker, PermissionHandler permissionHandler, SuperPassUserProofUploadViewModel superPassUserProofUploadViewModel, ProofDocumentProps proofDocumentProps, Continuation continuation) {
        super(2, continuation);
        this.$imagePicker = imagePicker;
        this.$permissionHandler = permissionHandler;
        this.this$0 = superPassUserProofUploadViewModel;
        this.$proofDocumentProps = proofDocumentProps;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassUserProofUploadViewModel$handleNextBtnClickedIntent$1(this.$imagePicker, this.$permissionHandler, this.this$0, this.$proofDocumentProps, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassUserProofUploadViewModel$handleNextBtnClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SuperPassUserProofUploadViewModel$handleNextBtnClickedIntent$1 superPassUserProofUploadViewModel$handleNextBtnClickedIntent$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ImagePicker imagePicker = this.$imagePicker;
            PermissionHandler permissionHandler = this.$permissionHandler;
            float f = PlatformFeature.f10436a;
            ImagePickerConfig imagePickerConfig = new ImagePickerConfig();
            l91 l91Var = new l91(this.this$0, 26);
            SuperPassUserProofUploadViewModel$handleNextBtnClickedIntent$1$result$2 superPassUserProofUploadViewModel$handleNextBtnClickedIntent$1$result$2 = new SuperPassUserProofUploadViewModel$handleNextBtnClickedIntent$1$result$2(0, this.this$0, SuperPassUserProofUploadViewModel.class, "raisePhotoChooserLaunchedEvent", "raisePhotoChooserLaunchedEvent()V", 0);
            SuperPassUserProofUploadViewModel$handleNextBtnClickedIntent$1$result$3 superPassUserProofUploadViewModel$handleNextBtnClickedIntent$1$result$3 = new SuperPassUserProofUploadViewModel$handleNextBtnClickedIntent$1$result$3(0, this.this$0, SuperPassUserProofUploadViewModel.class, "raiseCameraPermissionRequestedEvent", "raiseCameraPermissionRequestedEvent()V", 0);
            this.label = 1;
            superPassUserProofUploadViewModel$handleNextBtnClickedIntent$1 = this;
            obj = ImagePickerHelperKt.a(imagePicker, permissionHandler, imagePickerConfig, l91Var, superPassUserProofUploadViewModel$handleNextBtnClickedIntent$1$result$2, superPassUserProofUploadViewModel$handleNextBtnClickedIntent$1$result$3, superPassUserProofUploadViewModel$handleNextBtnClickedIntent$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            superPassUserProofUploadViewModel$handleNextBtnClickedIntent$1 = this;
        }
        ImagePickerResult imagePickerResult = (ImagePickerResult) obj;
        if (imagePickerResult instanceof ImagePickerResult.ImagePicked) {
            superPassUserProofUploadViewModel$handleNextBtnClickedIntent$1.this$0.l.o(superPassUserProofUploadViewModel$handleNextBtnClickedIntent$1.$proofDocumentProps.f9539a, ((ImagePickerResult.ImagePicked) imagePickerResult).f2788a, KUUID.a());
            gf.u(null, superPassUserProofUploadViewModel$handleNextBtnClickedIntent$1.this$0.m);
        } else if (!(imagePickerResult instanceof ImagePickerResult.PickerError) && !Intrinsics.d(imagePickerResult, ImagePickerResult.PickerClosed.f2789a) && imagePickerResult != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f17538a;
    }
}
