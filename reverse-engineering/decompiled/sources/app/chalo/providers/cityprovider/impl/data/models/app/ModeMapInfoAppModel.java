package app.chalo.providers.cityprovider.impl.data.models.app;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/app/ModeMapInfoAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ModeMapInfoAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTransitMode f8858a;
    public final String b;
    public final ArrayList c;

    public ModeMapInfoAppModel(ChaloTransitMode chaloTransitMode, String str, ArrayList arrayList) {
        this.f8858a = chaloTransitMode;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeMapInfoAppModel)) {
            return false;
        }
        ModeMapInfoAppModel modeMapInfoAppModel = (ModeMapInfoAppModel) obj;
        return this.f8858a == modeMapInfoAppModel.f8858a && Intrinsics.d(this.b, modeMapInfoAppModel.b) && this.c.equals(modeMapInfoAppModel.c);
    }

    public final int hashCode() {
        int iHashCode = this.f8858a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ModeMapInfoAppModel(mode=" + this.f8858a + ", imageUrl=" + this.b + ", agencies=" + this.c + ")";
    }
}
