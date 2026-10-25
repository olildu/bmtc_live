package app.chalo.compose.components.chalomap;

import android.graphics.Point;
import app.chalo.utils.ChaloUseCaseResult;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/ProjectionUtilsAndroid;", "Lapp/chalo/compose/components/chalomap/ProjectionUtils;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProjectionUtilsAndroid implements ProjectionUtils {
    public static ChaloUseCaseResult c(MapProjection projection, float f) {
        Intrinsics.i(projection, "projection");
        AndroidMapProjection androidMapProjection = projection instanceof AndroidMapProjection ? (AndroidMapProjection) projection : null;
        if (androidMapProjection == null) {
            return new ChaloUseCaseResult.Failure(Unit.f17538a);
        }
        Projection projection2 = androidMapProjection.f1861a;
        VisibleRegion visibleRegion = projection2.getVisibleRegion();
        Intrinsics.h(visibleRegion, "getVisibleRegion(...)");
        Point screenLocation = projection2.toScreenLocation(visibleRegion.farLeft);
        Intrinsics.h(screenLocation, "toScreenLocation(...)");
        Point screenLocation2 = projection2.toScreenLocation(visibleRegion.nearLeft);
        Intrinsics.h(screenLocation2, "toScreenLocation(...)");
        int i = screenLocation2.y - screenLocation.y;
        LatLng nearLeft = visibleRegion.nearLeft;
        Intrinsics.h(nearLeft, "nearLeft");
        app.chalo.location.LatLng latLng = new app.chalo.location.LatLng(nearLeft);
        LatLng farLeft = visibleRegion.farLeft;
        Intrinsics.h(farLeft, "farLeft");
        return new ChaloUseCaseResult.Success(Integer.valueOf((int) ((f / ((float) latLng.a(new app.chalo.location.LatLng(farLeft)))) * i)));
    }

    @Override // app.chalo.compose.components.chalomap.ProjectionUtils
    public final ChaloUseCaseResult a(AndroidMapCameraPosition androidMapCameraPosition) {
        CameraPosition cameraPosition = androidMapCameraPosition.f1860a;
        return cameraPosition == null ? new ChaloUseCaseResult.Failure(Unit.f17538a) : new ChaloUseCaseResult.Success(Float.valueOf(cameraPosition.zoom));
    }

    @Override // app.chalo.compose.components.chalomap.ProjectionUtils
    public final ChaloUseCaseResult b(MapProjection projection) {
        Projection projection2;
        Intrinsics.i(projection, "projection");
        AndroidMapProjection androidMapProjection = projection instanceof AndroidMapProjection ? (AndroidMapProjection) projection : null;
        if (androidMapProjection == null || (projection2 = androidMapProjection.f1861a) == null) {
            return new ChaloUseCaseResult.Failure(Unit.f17538a);
        }
        VisibleRegion visibleRegion = projection2.getVisibleRegion();
        Intrinsics.h(visibleRegion, "getVisibleRegion(...)");
        Point screenLocation = projection2.toScreenLocation(visibleRegion.nearRight);
        Intrinsics.h(screenLocation, "toScreenLocation(...)");
        LatLng latLngFromScreenLocation = projection2.fromScreenLocation(new Point(screenLocation.x / 2, screenLocation.y / 2));
        Intrinsics.f(latLngFromScreenLocation);
        return new ChaloUseCaseResult.Success(new app.chalo.location.LatLng(latLngFromScreenLocation));
    }
}
