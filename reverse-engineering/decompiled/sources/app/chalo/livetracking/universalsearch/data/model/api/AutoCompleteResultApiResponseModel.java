package app.chalo.livetracking.universalsearch.data.model.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/AutoCompleteResultApiResponseModel;", "", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class AutoCompleteResultApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchedResultItemsApiResponseModel f4969a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/api/AutoCompleteResultApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/universalsearch/data/model/api/AutoCompleteResultApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<AutoCompleteResultApiResponseModel> serializer() {
            return AutoCompleteResultApiResponseModel$$serializer.f4970a;
        }
    }

    public /* synthetic */ AutoCompleteResultApiResponseModel(int i, SearchedResultItemsApiResponseModel searchedResultItemsApiResponseModel) {
        if ((i & 1) == 0) {
            this.f4969a = null;
        } else {
            this.f4969a = searchedResultItemsApiResponseModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoCompleteResultApiResponseModel) && Intrinsics.d(this.f4969a, ((AutoCompleteResultApiResponseModel) obj).f4969a);
    }

    public final int hashCode() {
        SearchedResultItemsApiResponseModel searchedResultItemsApiResponseModel = this.f4969a;
        if (searchedResultItemsApiResponseModel == null) {
            return 0;
        }
        return searchedResultItemsApiResponseModel.hashCode();
    }

    public final String toString() {
        return "AutoCompleteResultApiResponseModel(data=" + this.f4969a + ")";
    }
}
