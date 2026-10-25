package app.chalo.validationsdk.blevalidation.helper;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BlePassiveModeStatus;", "", "Uninitialized", "Running", "Stopped", "Error", "Lapp/chalo/validationsdk/blevalidation/helper/BlePassiveModeStatus$Error;", "Lapp/chalo/validationsdk/blevalidation/helper/BlePassiveModeStatus$Running;", "Lapp/chalo/validationsdk/blevalidation/helper/BlePassiveModeStatus$Stopped;", "Lapp/chalo/validationsdk/blevalidation/helper/BlePassiveModeStatus$Uninitialized;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BlePassiveModeStatus {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BlePassiveModeStatus$Error;", "Lapp/chalo/validationsdk/blevalidation/helper/BlePassiveModeStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends BlePassiveModeStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10530a;

        public Error(String reason) {
            Intrinsics.i(reason, "reason");
            this.f10530a = reason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.f10530a, ((Error) obj).f10530a);
        }

        public final int hashCode() {
            return this.f10530a.hashCode();
        }

        public final String toString() {
            return vo1.B("Error(reason=", this.f10530a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BlePassiveModeStatus$Running;", "Lapp/chalo/validationsdk/blevalidation/helper/BlePassiveModeStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Running extends BlePassiveModeStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Running f10531a = new Running();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BlePassiveModeStatus$Stopped;", "Lapp/chalo/validationsdk/blevalidation/helper/BlePassiveModeStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Stopped extends BlePassiveModeStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10532a;

        public Stopped(String reason) {
            Intrinsics.i(reason, "reason");
            this.f10532a = reason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stopped) && Intrinsics.d(this.f10532a, ((Stopped) obj).f10532a);
        }

        public final int hashCode() {
            return this.f10532a.hashCode();
        }

        public final String toString() {
            return vo1.B("Stopped(reason=", this.f10532a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/helper/BlePassiveModeStatus$Uninitialized;", "Lapp/chalo/validationsdk/blevalidation/helper/BlePassiveModeStatus;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Uninitialized extends BlePassiveModeStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Uninitialized f10533a = new Uninitialized();
    }
}
