package app.chalo.recent.localsource.recent;

import app.chalo.recent.database.dao.recent.RecentStopBasedTripCityItineraryDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSourceImpl", f = "RecentStopBasedTripLocalDataSourceImpl.kt", l = {167}, m = "checkIfTripAlreadyExists", v = 1)
final class RecentStopBasedTripLocalDataSourceImpl$checkIfTripAlreadyExists$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentStopBasedTripLocalDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopBasedTripLocalDataSourceImpl$checkIfTripAlreadyExists$1(RecentStopBasedTripLocalDataSourceImpl recentStopBasedTripLocalDataSourceImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = recentStopBasedTripLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RecentStopBasedTripLocalDataSourceImpl$checkIfTripAlreadyExists$1 recentStopBasedTripLocalDataSourceImpl$checkIfTripAlreadyExists$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        RecentStopBasedTripLocalDataSourceImpl recentStopBasedTripLocalDataSourceImpl = this.this$0;
        recentStopBasedTripLocalDataSourceImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            recentStopBasedTripLocalDataSourceImpl$checkIfTripAlreadyExists$1 = this;
        } else {
            recentStopBasedTripLocalDataSourceImpl$checkIfTripAlreadyExists$1 = new RecentStopBasedTripLocalDataSourceImpl$checkIfTripAlreadyExists$1(recentStopBasedTripLocalDataSourceImpl, this);
        }
        Object objG = recentStopBasedTripLocalDataSourceImpl$checkIfTripAlreadyExists$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = recentStopBasedTripLocalDataSourceImpl$checkIfTripAlreadyExists$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            RecentStopBasedTripCityItineraryDao recentStopBasedTripCityItineraryDao = recentStopBasedTripLocalDataSourceImpl.f8977a;
            recentStopBasedTripLocalDataSourceImpl$checkIfTripAlreadyExists$1.label = 1;
            objG = recentStopBasedTripCityItineraryDao.g(null, null, recentStopBasedTripLocalDataSourceImpl$checkIfTripAlreadyExists$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        return Boolean.valueOf(objG != null);
    }
}
