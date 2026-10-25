package app.chalo.domain;

import app.chalo.location.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/domain/PolylineTrimRequest;", "", "FromStartToPoint", "FromPointToEnd", "FromPointToPoint", "Lapp/chalo/domain/PolylineTrimRequest$FromPointToEnd;", "Lapp/chalo/domain/PolylineTrimRequest$FromPointToPoint;", "Lapp/chalo/domain/PolylineTrimRequest$FromStartToPoint;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PolylineTrimRequest {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/PolylineTrimRequest$FromPointToEnd;", "Lapp/chalo/domain/PolylineTrimRequest;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FromPointToEnd extends PolylineTrimRequest {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FromPointToEnd);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FromPointToEnd(point=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/PolylineTrimRequest$FromPointToPoint;", "Lapp/chalo/domain/PolylineTrimRequest;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FromPointToPoint extends PolylineTrimRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LatLng f2514a;
        public final LatLng b;

        public FromPointToPoint(LatLng from, LatLng to) {
            Intrinsics.i(from, "from");
            Intrinsics.i(to, "to");
            this.f2514a = from;
            this.b = to;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FromPointToPoint)) {
                return false;
            }
            FromPointToPoint fromPointToPoint = (FromPointToPoint) obj;
            return Intrinsics.d(this.f2514a, fromPointToPoint.f2514a) && Intrinsics.d(this.b, fromPointToPoint.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f2514a.hashCode() * 31);
        }

        public final String toString() {
            return "FromPointToPoint(from=" + this.f2514a + ", to=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/PolylineTrimRequest$FromStartToPoint;", "Lapp/chalo/domain/PolylineTrimRequest;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FromStartToPoint extends PolylineTrimRequest {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FromStartToPoint);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FromStartToPoint(point=null)";
        }
    }
}
