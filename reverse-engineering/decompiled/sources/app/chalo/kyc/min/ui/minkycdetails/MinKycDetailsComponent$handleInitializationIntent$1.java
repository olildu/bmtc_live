package app.chalo.kyc.min.ui.minkycdetails;

import app.chalo.extensions.AnyExtsKt;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofile.UserProfileAppModel;
import defpackage.n10;
import defpackage.wi0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsComponent$handleInitializationIntent$1", f = "MinKycDetailsComponent.kt", l = {EACTags.DISPLAY_IMAGE}, m = "invokeSuspend", v = 1)
final class MinKycDetailsComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MinKycDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinKycDetailsComponent$handleInitializationIntent$1(MinKycDetailsComponent minKycDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = minKycDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MinKycDetailsComponent$handleInitializationIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MinKycDetailsComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String string;
        String strA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MinKycDetailsComponent minKycDetailsComponent = this.this$0;
            MinKycDetailsRestoredDataState minKycDetailsRestoredDataState = minKycDetailsComponent.p;
            if (minKycDetailsRestoredDataState == null || (string = minKycDetailsRestoredDataState.f4124a) == null) {
                UserProfileDetailsProvider userProfileDetailsProvider = minKycDetailsComponent.n;
                this.label = 1;
                obj = userProfileDetailsProvider.l(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.this$0.E0(new n10(string, 28));
            if (AnyExtsKt.a(string)) {
                this.this$0.E0(new n10(string, 29));
            } else {
                this.this$0.r0(MinKycDetailsSideEffect.RequestFocusOnFullNameEditTextSideEffect.f4127a);
                MinKycDetailsComponent minKycDetailsComponent2 = this.this$0;
                minKycDetailsComponent2.E0(new wi0(minKycDetailsComponent2, 3));
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        UserProfileAppModel userProfileAppModel = (UserProfileAppModel) obj;
        if (userProfileAppModel == null || (strA = userProfileAppModel.a()) == null) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            int length = strA.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = strA.charAt(i2);
                char c = cCharAt;
                if (Character.isLetter(c) || CharsKt.d(c)) {
                    sb.append(cCharAt);
                }
            }
            string = sb.toString();
        }
        this.this$0.E0(new n10(string, 28));
        if (AnyExtsKt.a(string)) {
            this.this$0.E0(new n10(string, 29));
        } else {
            this.this$0.r0(MinKycDetailsSideEffect.RequestFocusOnFullNameEditTextSideEffect.f4127a);
            MinKycDetailsComponent minKycDetailsComponent3 = this.this$0;
            minKycDetailsComponent3.E0(new wi0(minKycDetailsComponent3, 3));
        }
        return Unit.f17538a;
    }
}
