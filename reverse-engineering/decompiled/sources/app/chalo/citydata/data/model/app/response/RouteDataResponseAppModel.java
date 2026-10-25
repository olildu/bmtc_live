package app.chalo.citydata.data.model.app.response;

import app.chalo.citydata.data.model.app.RouteAppModel;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/citydata/data/model/app/response/RouteDataResponseAppModel;", "", "Deleted", "NoUpdate", "Updated", "Lapp/chalo/citydata/data/model/app/response/RouteDataResponseAppModel$Deleted;", "Lapp/chalo/citydata/data/model/app/response/RouteDataResponseAppModel$NoUpdate;", "Lapp/chalo/citydata/data/model/app/response/RouteDataResponseAppModel$Updated;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RouteDataResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1742a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/response/RouteDataResponseAppModel$Deleted;", "Lapp/chalo/citydata/data/model/app/response/RouteDataResponseAppModel;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Deleted extends RouteDataResponseAppModel {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Deleted(String rId) {
            super(rId);
            Intrinsics.i(rId, "rId");
            this.b = rId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Deleted) && Intrinsics.d(this.b, ((Deleted) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("Deleted(rId=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/response/RouteDataResponseAppModel$NoUpdate;", "Lapp/chalo/citydata/data/model/app/response/RouteDataResponseAppModel;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoUpdate extends RouteDataResponseAppModel {
        public final String b;
        public final RouteResponseLiveDataAppModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoUpdate(String rId, RouteResponseLiveDataAppModel routeResponseLiveDataAppModel) {
            super(rId);
            Intrinsics.i(rId, "rId");
            this.b = rId;
            this.c = routeResponseLiveDataAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoUpdate)) {
                return false;
            }
            NoUpdate noUpdate = (NoUpdate) obj;
            return Intrinsics.d(this.b, noUpdate.b) && Intrinsics.d(this.c, noUpdate.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "NoUpdate(rId=" + this.b + ", routeLiveData=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/response/RouteDataResponseAppModel$Updated;", "Lapp/chalo/citydata/data/model/app/response/RouteDataResponseAppModel;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Updated extends RouteDataResponseAppModel {
        public final RouteAppModel b;

        public Updated(RouteAppModel routeAppModel) {
            super(routeAppModel.b);
            this.b = routeAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Updated) && Intrinsics.d(this.b, ((Updated) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Updated(routeAppModel=" + this.b + ")";
        }
    }

    public RouteDataResponseAppModel(String str) {
        this.f1742a = str;
    }
}
