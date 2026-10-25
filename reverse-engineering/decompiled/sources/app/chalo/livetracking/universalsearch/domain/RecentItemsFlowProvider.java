package app.chalo.livetracking.universalsearch.domain;

import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/RecentItemsFlowProvider;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecentItemsFlowProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentRepositoryProvider f5036a;

    public RecentItemsFlowProvider(RecentRepositoryProvider recentRepositoryProvider) {
        this.f5036a = recentRepositoryProvider;
    }

    public static Object a(TransitModeSearchFilter transitModeSearchFilter, Function1 function1, Function2 function2, SuspendLambda suspendLambda) {
        if (Intrinsics.d(transitModeSearchFilter, TransitModeSearchFilter.NoFilter.f5038a)) {
            return function1.invoke(suspendLambda);
        }
        if (transitModeSearchFilter instanceof TransitModeSearchFilter.OneOf) {
            return function2.invoke(((TransitModeSearchFilter.OneOf) transitModeSearchFilter).f5039a, suspendLambda);
        }
        throw new NoWhenBranchMatchedException();
    }
}
