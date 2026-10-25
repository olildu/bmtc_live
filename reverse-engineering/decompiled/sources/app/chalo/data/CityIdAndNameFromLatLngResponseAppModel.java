package app.chalo.data;

import defpackage.gf;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/CityIdAndNameFromLatLngResponseAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CityIdAndNameFromLatLngResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2341a;

    public CityIdAndNameFromLatLngResponseAppModel(ArrayList arrayList) {
        this.f2341a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CityIdAndNameFromLatLngResponseAppModel) && this.f2341a.equals(((CityIdAndNameFromLatLngResponseAppModel) obj).f2341a);
    }

    public final int hashCode() {
        return this.f2341a.hashCode();
    }

    public final String toString() {
        return gf.i("CityIdAndNameFromLatLngResponseAppModel(cities=", ")", this.f2341a);
    }
}
