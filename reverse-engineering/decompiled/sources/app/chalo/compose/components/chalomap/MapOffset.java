package app.chalo.compose.components.chalomap;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/MapOffset;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MapOffset {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1883a;
    public final float b;

    public MapOffset(float f, float f2) {
        this.f1883a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapOffset)) {
            return false;
        }
        MapOffset mapOffset = (MapOffset) obj;
        return Float.compare(this.f1883a, mapOffset.f1883a) == 0 && Float.compare(this.b, mapOffset.b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.f1883a) * 31);
    }

    public final String toString() {
        return "MapOffset(x=" + this.f1883a + ", y=" + this.b + ")";
    }
}
