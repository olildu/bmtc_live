package app.chalo.productpurchase.passpurchase.ui.factory;

import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/factory/AgencyAndProofDetails;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AgencyAndProofDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AgencyInfoAppModel f8432a;
    public final List b;

    public AgencyAndProofDetails(AgencyInfoAppModel agencyInfoAppModel, List proofDocumentPropsList) {
        Intrinsics.i(proofDocumentPropsList, "proofDocumentPropsList");
        this.f8432a = agencyInfoAppModel;
        this.b = proofDocumentPropsList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgencyAndProofDetails)) {
            return false;
        }
        AgencyAndProofDetails agencyAndProofDetails = (AgencyAndProofDetails) obj;
        return Intrinsics.d(this.f8432a, agencyAndProofDetails.f8432a) && Intrinsics.d(this.b, agencyAndProofDetails.b);
    }

    public final int hashCode() {
        AgencyInfoAppModel agencyInfoAppModel = this.f8432a;
        return this.b.hashCode() + ((agencyInfoAppModel == null ? 0 : agencyInfoAppModel.hashCode()) * 31);
    }

    public final String toString() {
        return "AgencyAndProofDetails(agency=" + this.f8432a + ", proofDocumentPropsList=" + this.b + ")";
    }
}
