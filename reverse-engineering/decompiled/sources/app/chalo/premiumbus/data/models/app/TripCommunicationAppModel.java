package app.chalo.premiumbus.data.models.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/TripCommunicationAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TripCommunicationAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7126a;
    public final TripCommunicationIconType b;

    public TripCommunicationAppModel(String text, TripCommunicationIconType iconType) {
        Intrinsics.i(text, "text");
        Intrinsics.i(iconType, "iconType");
        this.f7126a = text;
        this.b = iconType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripCommunicationAppModel)) {
            return false;
        }
        TripCommunicationAppModel tripCommunicationAppModel = (TripCommunicationAppModel) obj;
        return Intrinsics.d(this.f7126a, tripCommunicationAppModel.f7126a) && this.b == tripCommunicationAppModel.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7126a.hashCode() * 31);
    }

    public final String toString() {
        return "TripCommunicationAppModel(text=" + this.f7126a + ", iconType=" + this.b + ")";
    }
}
