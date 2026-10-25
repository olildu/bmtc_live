package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.home.data.model.app.response.ScheduleBlockKey;
import app.chalo.home.data.model.app.response.ScheduleBlockType;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/RouteInfoTabUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteInfoTabUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduleBlockKey f3367a;
    public final String b;
    public final ScheduleBlockType c;

    public RouteInfoTabUiModel(ScheduleBlockKey id, String title, ScheduleBlockType type) {
        Intrinsics.i(id, "id");
        Intrinsics.i(title, "title");
        Intrinsics.i(type, "type");
        this.f3367a = id;
        this.b = title;
        this.c = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteInfoTabUiModel)) {
            return false;
        }
        RouteInfoTabUiModel routeInfoTabUiModel = (RouteInfoTabUiModel) obj;
        return Intrinsics.d(this.f3367a, routeInfoTabUiModel.f3367a) && Intrinsics.d(this.b, routeInfoTabUiModel.b) && this.c == routeInfoTabUiModel.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f3367a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "RouteInfoTabUiModel(id=" + this.f3367a + ", title=" + this.b + ", type=" + this.c + ")";
    }
}
