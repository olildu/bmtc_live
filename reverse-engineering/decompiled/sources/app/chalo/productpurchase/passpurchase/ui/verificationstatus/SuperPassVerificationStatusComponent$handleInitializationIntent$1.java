package app.chalo.productpurchase.passpurchase.ui.verificationstatus;

import app.chalo.network.config.ChaloJson;
import app.chalo.productpurchase.passpurchase.domain.GetPassVerificationTimingDetailsUseCase;
import app.chalo.productpurchase.passpurchase.domain.MPassVerificationTimingDetails;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import defpackage.l91;
import defpackage.rw0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusComponent$handleInitializationIntent$1", f = "SuperPassVerificationStatusComponent.kt", l = {EACTags.HISTORICAL_BYTES}, m = "invokeSuspend", v = 1)
final class SuperPassVerificationStatusComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SuperPassVerificationStatusIntent.InitializationIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ SuperPassVerificationStatusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassVerificationStatusComponent$handleInitializationIntent$1(SuperPassVerificationStatusIntent.InitializationIntent initializationIntent, SuperPassVerificationStatusComponent superPassVerificationStatusComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = initializationIntent;
        this.this$0 = superPassVerificationStatusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassVerificationStatusComponent$handleInitializationIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassVerificationStatusComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        SuperPassApplication superPassApplication;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            ChaloJson chaloJson = ChaloJson.f6455a;
            String str = this.$intent.f8516a.b;
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, SuperPassApplication.INSTANCE.serializer());
            } catch (Exception unused) {
                objB = null;
            }
            SuperPassApplication superPassApplication2 = (SuperPassApplication) objB;
            if (superPassApplication2 == null) {
                this.this$0.E0(new l91(this.$intent, 27));
                this.this$0.G0();
                return unit;
            }
            GetPassVerificationTimingDetailsUseCase getPassVerificationTimingDetailsUseCase = this.this$0.l;
            this.L$0 = superPassApplication2;
            this.label = 1;
            Object objA = getPassVerificationTimingDetailsUseCase.a(this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            superPassApplication = superPassApplication2;
            obj = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            superPassApplication = (SuperPassApplication) this.L$0;
            ResultKt.b(obj);
        }
        int i2 = 19;
        this.this$0.E0(new rw0(i2, superPassApplication, this.$intent, (MPassVerificationTimingDetails) obj));
        SuperPassVerificationStatusComponent superPassVerificationStatusComponent = this.this$0;
        String str2 = this.$intent.f8516a.c;
        superPassVerificationStatusComponent.getClass();
        SuperPassVerificationStatusComponent.J0(superPassVerificationStatusComponent, "mPass verification status activity open", superPassApplication, str2, 2);
        return unit;
    }
}
