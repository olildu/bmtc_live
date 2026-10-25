package app.chalo.livetracking.universalsearch.data.model.api;

import defpackage.p41;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/SearchedResultItemsApiResponseModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SearchedResultItemsApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4987a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/SearchedResultItemsApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/universalsearch/data/model/api/SearchedResultItemsApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SearchedResultItemsApiResponseModel> serializer() {
            return SearchedResultItemsApiResponseModel$$serializer.f4988a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new p41(14)), LazyKt.a(lazyThreadSafetyMode, new p41(15))};
    }

    public /* synthetic */ SearchedResultItemsApiResponseModel(List list, int i, List list2) {
        if ((i & 1) == 0) {
            this.f4987a = null;
        } else {
            this.f4987a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchedResultItemsApiResponseModel)) {
            return false;
        }
        SearchedResultItemsApiResponseModel searchedResultItemsApiResponseModel = (SearchedResultItemsApiResponseModel) obj;
        return Intrinsics.d(this.f4987a, searchedResultItemsApiResponseModel.f4987a) && Intrinsics.d(this.b, searchedResultItemsApiResponseModel.b);
    }

    public final int hashCode() {
        List list = this.f4987a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "SearchedResultItemsApiResponseModel(routesDetailApiModelList=" + this.f4987a + ", placesAndStopsInfoApiModel=" + this.b + ")";
    }
}
