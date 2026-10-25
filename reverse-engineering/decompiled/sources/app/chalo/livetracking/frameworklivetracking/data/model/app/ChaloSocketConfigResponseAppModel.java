package app.chalo.livetracking.frameworklivetracking.data.model.app;

import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/ChaloSocketConfigResponseAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloSocketConfigResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectionDataAppModel f4299a;
    public final LinkedHashMap b;

    public ChaloSocketConfigResponseAppModel(ConnectionDataAppModel connectionDataAppModel, LinkedHashMap linkedHashMap) {
        this.f4299a = connectionDataAppModel;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloSocketConfigResponseAppModel)) {
            return false;
        }
        ChaloSocketConfigResponseAppModel chaloSocketConfigResponseAppModel = (ChaloSocketConfigResponseAppModel) obj;
        return this.f4299a.equals(chaloSocketConfigResponseAppModel.f4299a) && this.b.equals(chaloSocketConfigResponseAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4299a.hashCode() * 31);
    }

    public final String toString() {
        return "ChaloSocketConfigResponseAppModel(socketConnectionData=" + this.f4299a + ", rtsServiceDetails=" + this.b + ")";
    }
}
