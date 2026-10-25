package app.chalo.userprofile.ui;

import app.chalo.fileupload.picker.ImagePicker;
import app.chalo.fileupload.picker.ImagePickerConfig;
import app.chalo.fileupload.picker.ImagePickerResult;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.userprofile.ui.UserProfileFormComponent$pickImage$1", f = "UserProfileFormComponent.kt", l = {196}, m = "invokeSuspend", v = 1)
final class UserProfileFormComponent$pickImage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UserProfileFormComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileFormComponent$pickImage$1(UserProfileFormComponent userProfileFormComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userProfileFormComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfileFormComponent$pickImage$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileFormComponent$pickImage$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ImagePickerResult imagePickerResult;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ImagePicker imagePickerC = this.this$0.o.c();
            if (imagePickerC != null) {
                ImagePickerConfig imagePickerConfig = new ImagePickerConfig();
                this.label = 1;
                obj = imagePickerC.a(imagePickerConfig, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                imagePickerResult = null;
            }
            if (imagePickerResult instanceof ImagePickerResult.ImagePicked) {
                this.this$0.I0(new UserProfileFormIntent.ProfilePhotoSelected(((ImagePickerResult.ImagePicked) imagePickerResult).f2788a));
            } else if (!Intrinsics.d(imagePickerResult, ImagePickerResult.PickerClosed.f2789a) && !(imagePickerResult instanceof ImagePickerResult.PickerError) && imagePickerResult != null) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        imagePickerResult = (ImagePickerResult) obj;
        if (imagePickerResult instanceof ImagePickerResult.ImagePicked) {
            this.this$0.I0(new UserProfileFormIntent.ProfilePhotoSelected(((ImagePickerResult.ImagePicked) imagePickerResult).f2788a));
        } else if (!Intrinsics.d(imagePickerResult, ImagePickerResult.PickerClosed.f2789a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f17538a;
    }
}
