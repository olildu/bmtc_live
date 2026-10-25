package app.chalo.permissions.models;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AppPermission_androidKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6833a;

        static {
            int[] iArr = new int[AppPermission.values().length];
            try {
                iArr[AppPermission.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppPermission.COARSE_LOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppPermission.FINE_LOCATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppPermission.POST_NOTIFICATIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AppPermission.BLUETOOTH_SCAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AppPermission.BLUETOOTH_CONNECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AppPermission.BLUETOOTH_ADVERTISE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AppPermission.READ_SMS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AppPermission.SEND_SMS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AppPermission.RECEIVE_SMS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AppPermission.READ_PHONE_STATE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AppPermission.APP_TRACKING_TRANSPARENCY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f6833a = iArr;
        }
    }

    public static final PlatformPermissionName a(AppPermission appPermission) {
        Intrinsics.i(appPermission, "<this>");
        switch (WhenMappings.f6833a[appPermission.ordinal()]) {
            case 1:
                return new PlatformPermissionName("android.permission.CAMERA");
            case 2:
                return new PlatformPermissionName("android.permission.ACCESS_COARSE_LOCATION");
            case 3:
                return new PlatformPermissionName("android.permission.ACCESS_FINE_LOCATION");
            case 4:
                return (PlatformPermissionName) PlatformPermissionName.b.getValue();
            case 5:
                return (PlatformPermissionName) PlatformPermissionName.c.getValue();
            case 6:
                return (PlatformPermissionName) PlatformPermissionName.d.getValue();
            case 7:
                return (PlatformPermissionName) PlatformPermissionName.e.getValue();
            case 8:
                return new PlatformPermissionName("android.permission.READ_SMS");
            case 9:
                return new PlatformPermissionName("android.permission.SEND_SMS");
            case 10:
                return new PlatformPermissionName("android.permission.RECEIVE_SMS");
            case 11:
                return new PlatformPermissionName("android.permission.READ_PHONE_STATE");
            case 12:
                return new PlatformPermissionName("APP_TRACKING_TRANSPARENCY");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
