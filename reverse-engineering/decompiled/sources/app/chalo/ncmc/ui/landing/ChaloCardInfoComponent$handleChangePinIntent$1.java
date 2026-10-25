package app.chalo.ncmc.ui.landing;

import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.ncmc.domain.ChangeNCMCPinUseCase;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.WebViewArgs;
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
@DebugMetadata(c = "app.chalo.ncmc.ui.landing.ChaloCardInfoComponent$handleChangePinIntent$1", f = "ChaloCardInfoComponent.kt", l = {948, 979}, m = "invokeSuspend", v = 1)
final class ChaloCardInfoComponent$handleChangePinIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $kitNumber;
    Object L$0;
    int label;
    final /* synthetic */ ChaloCardInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardInfoComponent$handleChangePinIntent$1(ChaloCardInfoComponent chaloCardInfoComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloCardInfoComponent;
        this.$kitNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloCardInfoComponent$handleChangePinIntent$1(this.this$0, this.$kitNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloCardInfoComponent$handleChangePinIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
            this.this$0.E0(new pi(12));
            ChangeNCMCPinUseCase changeNCMCPinUseCase = this.this$0.x;
            String str2 = this.$kitNumber;
            this.label = 1;
            obj = changeNCMCPinUseCase.b(str2, this);
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
            this.this$0.D.b(new ChaloNavigationRequest.Navigate(new WebViewArgs((String) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a, "", false, false), null, null, 6));
            this.this$0.E0(new pi(13));
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.E0(new pi(14));
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
