package app.chalo.ridefeedback.domain;

import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTripAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lapp/chalo/premiumbus/data/models/app/PremiumReserveTicketAppModel;", "Lapp/chalo/premiumbus/data/models/app/PremiumReserveTripAppModel;", "tickets", "trips"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ridefeedback.domain.BackfillPendingPremiumBusPrfUseCase$invoke$2", f = "BackfillPendingPremiumBusPrfUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
final class BackfillPendingPremiumBusPrfUseCase$invoke$2 extends SuspendLambda implements Function3<List<? extends PremiumReserveTicketAppModel>, List<? extends PremiumReserveTripAppModel>, Continuation<? super Pair<? extends List<? extends PremiumReserveTicketAppModel>, ? extends List<? extends PremiumReserveTripAppModel>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BackfillPendingPremiumBusPrfUseCase$invoke$2 backfillPendingPremiumBusPrfUseCase$invoke$2 = new BackfillPendingPremiumBusPrfUseCase$invoke$2(3, (Continuation) obj3);
        backfillPendingPremiumBusPrfUseCase$invoke$2.L$0 = (List) obj;
        backfillPendingPremiumBusPrfUseCase$invoke$2.L$1 = (List) obj2;
        return backfillPendingPremiumBusPrfUseCase$invoke$2.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return new Pair((List) this.L$0, (List) this.L$1);
    }
}
