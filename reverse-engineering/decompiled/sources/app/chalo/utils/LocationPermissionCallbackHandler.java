package app.chalo.utils;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.PermissionState;
import defpackage.vo1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/LocationPermissionCallbackHandler;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocationPermissionCallbackHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f10432a;
    public boolean b;

    public LocationPermissionCallbackHandler(AnalyticsContract analyticsContract) {
        this.f10432a = analyticsContract;
    }

    public final AppLocationPermissionState a(Source source, Map map) {
        Intrinsics.i(source, "source");
        Object obj = map.get(AppPermission.FINE_LOCATION);
        PermissionState permissionState = PermissionState.GRANTED;
        if (obj == permissionState) {
            this.b = false;
            b(source, "preciseLocationOptionSelected");
            return AppLocationPermissionState.FINE_LOCATION_PROVIDED;
        }
        if (map.get(AppPermission.COARSE_LOCATION) != permissionState) {
            b(source, this.b ? "approxLocationOptionSelected" : "locationPermissionDeniedByUser");
            this.b = false;
            return AppLocationPermissionState.NO_PERMISSION_GRANTED;
        }
        b(source, "approxLocationOptionSelected");
        if (this.b) {
            this.b = false;
            return AppLocationPermissionState.COARSE_LOCATION_PROVIDED_AND_UPGRADE_DENIED;
        }
        this.b = true;
        return AppLocationPermissionState.COARSE_LOCATION_PROVIDED_AND_UPGRADE_NOT_TRIGGERED;
    }

    public final void b(Source source, String str) {
        AnalyticsContract.DefaultImpls.a(this.f10432a, "access location event", source.getSourceName(), vo1.s("locationAccessAction", str), null, false, 24);
    }
}
