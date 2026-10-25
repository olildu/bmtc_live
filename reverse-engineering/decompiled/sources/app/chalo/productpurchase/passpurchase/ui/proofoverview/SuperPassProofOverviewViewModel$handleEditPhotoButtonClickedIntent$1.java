package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.fileupload.picker.ImagePicker;
import app.chalo.fileupload.picker.ImagePickerConfig;
import app.chalo.fileupload.picker.ImagePickerHelperKt;
import app.chalo.fileupload.picker.ImagePickerResult;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.PermissionState;
import app.chalo.utils.KUUID;
import app.chalo.utils.PlatformFeature;
import defpackage.dg1;
import defpackage.wb;
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
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1", f = "SuperPassProofOverviewViewModel.kt", l = {256}, m = "invokeSuspend", v = 1)
public final class SuperPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImagePicker $imagePicker;
    final /* synthetic */ SuperPassProofOverviewIntent.EditPhotoButtonClicked $intent;
    final /* synthetic */ PermissionHandler $permissionHandler;
    int label;
    final /* synthetic */ SuperPassProofOverviewViewModel this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8489a;

        static {
            int[] iArr = new int[PermissionState.values().length];
            try {
                iArr[PermissionState.REQUIRES_EXPLANATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionState.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionState.GRANTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PermissionState.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PermissionState.NOT_DETERMINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f8489a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1(ImagePicker imagePicker, PermissionHandler permissionHandler, SuperPassProofOverviewViewModel superPassProofOverviewViewModel, SuperPassProofOverviewIntent.EditPhotoButtonClicked editPhotoButtonClicked, Continuation continuation) {
        super(2, continuation);
        this.$imagePicker = imagePicker;
        this.$permissionHandler = permissionHandler;
        this.this$0 = superPassProofOverviewViewModel;
        this.$intent = editPhotoButtonClicked;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1(this.$imagePicker, this.$permissionHandler, this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SuperPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1 superPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ImagePicker imagePicker = this.$imagePicker;
            PermissionHandler permissionHandler = this.$permissionHandler;
            float f = PlatformFeature.f10436a;
            ImagePickerConfig imagePickerConfig = new ImagePickerConfig();
            dg1 dg1Var = new dg1(this.this$0, 1);
            this.label = 1;
            superPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1 = this;
            obj = ImagePickerHelperKt.a(imagePicker, permissionHandler, imagePickerConfig, dg1Var, new wb(8), new wb(8), superPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            superPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1 = this;
        }
        ImagePickerResult imagePickerResult = (ImagePickerResult) obj;
        if (imagePickerResult instanceof ImagePickerResult.ImagePicked) {
            superPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1.this$0.l.o(superPassProofOverviewViewModel$handleEditPhotoButtonClickedIntent$1.$intent.f8473a.f9539a, ((ImagePickerResult.ImagePicked) imagePickerResult).f2788a, KUUID.a());
        } else if (!(imagePickerResult instanceof ImagePickerResult.PickerError) && !Intrinsics.d(imagePickerResult, ImagePickerResult.PickerClosed.f2789a) && imagePickerResult != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f17538a;
    }
}
