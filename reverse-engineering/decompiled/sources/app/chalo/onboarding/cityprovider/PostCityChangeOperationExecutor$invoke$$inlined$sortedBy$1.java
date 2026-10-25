package app.chalo.onboarding.cityprovider;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class PostCityChangeOperationExecutor$invoke$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        PostCityChangeOperation postCityChangeOperation = (PostCityChangeOperation) obj;
        Intrinsics.i(postCityChangeOperation, "<this>");
        Integer numValueOf = Integer.valueOf(postCityChangeOperation.ordinal());
        PostCityChangeOperation postCityChangeOperation2 = (PostCityChangeOperation) obj2;
        Intrinsics.i(postCityChangeOperation2, "<this>");
        return ComparisonsKt.a(numValueOf, Integer.valueOf(postCityChangeOperation2.ordinal()));
    }
}
