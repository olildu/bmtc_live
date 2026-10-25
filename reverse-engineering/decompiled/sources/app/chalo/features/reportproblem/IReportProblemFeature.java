package app.chalo.features.reportproblem;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/reportproblem/IReportProblemFeature;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IReportProblemFeature {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Object a(String str, Continuation continuation);

    Object b(String str, String str2, Map map, boolean z, String str3, ContinuationImpl continuationImpl);

    Object c(Continuation continuation);

    Object d(String str, String str2, ContinuationImpl continuationImpl);

    void e(String str, String str2, String str3);

    Object f(JsonObject jsonObject, ContinuationImpl continuationImpl);

    Object g(ReportProblemFeatureData reportProblemFeatureData, ContinuationImpl continuationImpl);

    Object h(Continuation continuation);
}
