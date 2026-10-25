package app.chalo.recent.database.repository.recent;

import app.chalo.recent.localsource.recent.RecentTripLocalDataSource;
import app.chalo.recent.model.app.RecentTripAppModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TripRecentRepositoryImpl$purgeOldEntries$2$1<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TripRecentRepositoryImpl f8960a;

    public TripRecentRepositoryImpl$purgeOldEntries$2$1(TripRecentRepositoryImpl tripRecentRepositoryImpl) {
        this.f8960a = tripRecentRepositoryImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(List list, Continuation continuation) {
        TripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1 tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1;
        Iterator<T> it;
        TripRecentRepositoryImpl tripRecentRepositoryImpl;
        if (continuation instanceof TripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1) {
            tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1 = (TripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1) continuation;
            int i = tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1 = new TripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1(this, continuation);
            }
        } else {
            tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1 = new TripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1(this, continuation);
        }
        Object obj = tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            it = list.iterator();
            tripRecentRepositoryImpl = this.f8960a;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1.L$1;
            tripRecentRepositoryImpl = (TripRecentRepositoryImpl) tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1.L$0;
            ResultKt.b(obj);
        }
        while (it.hasNext()) {
            RecentTripAppModel recentTripAppModel = (RecentTripAppModel) it.next();
            RecentTripLocalDataSource recentTripLocalDataSource = tripRecentRepositoryImpl.f8959a;
            String str = recentTripAppModel.e;
            String str2 = recentTripAppModel.f;
            tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1.L$0 = tripRecentRepositoryImpl;
            tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1.L$1 = it;
            tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1.label = 1;
            if (recentTripLocalDataSource.c(str, str2, tripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f17538a;
    }
}
