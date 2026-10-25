package app.chalo.ncmc.ui.landing;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.ncmc.domain.UnlinkCardUseCase;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.hq0;
import defpackage.pi;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.landing.ChaloCardInfoComponent$unlinkCard$2", f = "ChaloCardInfoComponent.kt", l = {883, TypedValues.Custom.TYPE_STRING}, m = "invokeSuspend", v = 1)
final class ChaloCardInfoComponent$unlinkCard$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cardNumber;
    Object L$0;
    int label;
    final /* synthetic */ ChaloCardInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardInfoComponent$unlinkCard$2(ChaloCardInfoComponent chaloCardInfoComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloCardInfoComponent;
        this.$cardNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloCardInfoComponent$unlinkCard$2(this.this$0, this.$cardNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloCardInfoComponent$unlinkCard$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        String str;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            UnlinkCardUseCase unlinkCardUseCase = this.this$0.v;
            String str2 = this.$cardNumber;
            if (str2 == null) {
                str2 = "";
            }
            this.label = 1;
            obj = unlinkCardUseCase.b(str2, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager2 = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
        }
        str = (String) obj;
        kotlinToastManager = kotlinToastManager2;
        hq0.s(kotlinToastManager, str);
        return Unit.f17538a;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            this.this$0.E0(new pi(18));
            this.this$0.J0(true);
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.E0(new pi(19));
            ChaloCardInfoComponent chaloCardInfoComponent = this.this$0;
            kotlinToastManager = chaloCardInfoComponent.E;
            str = ((UseCaseOperationError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).c;
            if (str == null) {
                this.L$0 = kotlinToastManager;
                this.label = 2;
                obj = chaloCardInfoComponent.y.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                if (obj != coroutineSingletons) {
                    kotlinToastManager2 = kotlinToastManager;
                    str = (String) obj;
                    kotlinToastManager = kotlinToastManager2;
                }
                return coroutineSingletons;
            }
            hq0.s(kotlinToastManager, str);
        }
        return Unit.f17538a;
    }
}
