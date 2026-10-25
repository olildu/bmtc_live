package app.chalo.recent.localsource.recent;

import app.chalo.recent.database.dao.recent.RecentTripCityItineraryDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentTripLocalDataSourceImpl", f = "RecentTripLocalDataSourceImpl.kt", l = {113}, m = "checkIfTripAlreadyExists", v = 1)
final class RecentTripLocalDataSourceImpl$checkIfTripAlreadyExists$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentTripLocalDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentTripLocalDataSourceImpl$checkIfTripAlreadyExists$1(RecentTripLocalDataSourceImpl recentTripLocalDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = recentTripLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecentTripLocalDataSourceImpl$checkIfTripAlreadyExists$1 recentTripLocalDataSourceImpl$checkIfTripAlreadyExists$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RecentTripLocalDataSourceImpl recentTripLocalDataSourceImpl = this.this$0;
        recentTripLocalDataSourceImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            recentTripLocalDataSourceImpl$checkIfTripAlreadyExists$1 = this;
        } else {
            recentTripLocalDataSourceImpl$checkIfTripAlreadyExists$1 = new RecentTripLocalDataSourceImpl$checkIfTripAlreadyExists$1(recentTripLocalDataSourceImpl, this);
        }
        Object objH = recentTripLocalDataSourceImpl$checkIfTripAlreadyExists$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentTripLocalDataSourceImpl$checkIfTripAlreadyExists$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            RecentTripCityItineraryDao recentTripCityItineraryDao = recentTripLocalDataSourceImpl.f8989a;
            recentTripLocalDataSourceImpl$checkIfTripAlreadyExists$1.label = 1;
            objH = recentTripCityItineraryDao.h(null, null, recentTripLocalDataSourceImpl$checkIfTripAlreadyExists$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        return Boolean.valueOf(objH != null);
    }
}
