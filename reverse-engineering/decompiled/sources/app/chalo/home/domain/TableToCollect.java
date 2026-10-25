package app.chalo.home.domain;

import defpackage.cb0;
import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lapp/chalo/home/domain/TableToCollect;", "", "MTicket", "InstantTicket", "PremiumBusTicket", "QuickPay", "MagicSuperPass", "RideBasedSuperPass", "SuperPassApplication", "PendingSuperPass", "OndcTicket", "OndcMetroTicket", "MetroTicket", "PassRide", "MultiModalGroupTicket", "Lapp/chalo/home/domain/TableToCollect$InstantTicket;", "Lapp/chalo/home/domain/TableToCollect$MTicket;", "Lapp/chalo/home/domain/TableToCollect$MagicSuperPass;", "Lapp/chalo/home/domain/TableToCollect$MetroTicket;", "Lapp/chalo/home/domain/TableToCollect$MultiModalGroupTicket;", "Lapp/chalo/home/domain/TableToCollect$OndcMetroTicket;", "Lapp/chalo/home/domain/TableToCollect$OndcTicket;", "Lapp/chalo/home/domain/TableToCollect$PassRide;", "Lapp/chalo/home/domain/TableToCollect$PendingSuperPass;", "Lapp/chalo/home/domain/TableToCollect$PremiumBusTicket;", "Lapp/chalo/home/domain/TableToCollect$QuickPay;", "Lapp/chalo/home/domain/TableToCollect$RideBasedSuperPass;", "Lapp/chalo/home/domain/TableToCollect$SuperPassApplication;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class TableToCollect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/TableToCollect$InstantTicket;", "Lapp/chalo/home/domain/TableToCollect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InstantTicket extends TableToCollect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstantTicket f3079a = new InstantTicket();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InstantTicket);
        }

        public final int hashCode() {
            return 2072045527;
        }

        public final String toString() {
            return "InstantTicket";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/TableToCollect$MTicket;", "Lapp/chalo/home/domain/TableToCollect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MTicket extends TableToCollect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MTicket f3080a = new MTicket();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MTicket);
        }

        public final int hashCode() {
            return 1548916963;
        }

        public final String toString() {
            return "MTicket";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/TableToCollect$MagicSuperPass;", "Lapp/chalo/home/domain/TableToCollect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MagicSuperPass extends TableToCollect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MagicSuperPass f3081a = new MagicSuperPass();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MagicSuperPass);
        }

        public final int hashCode() {
            return 228783285;
        }

        public final String toString() {
            return "MagicSuperPass";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/TableToCollect$MetroTicket;", "Lapp/chalo/home/domain/TableToCollect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MetroTicket extends TableToCollect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MetroTicket f3082a = new MetroTicket();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/TableToCollect$MultiModalGroupTicket;", "Lapp/chalo/home/domain/TableToCollect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultiModalGroupTicket extends TableToCollect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MultiModalGroupTicket f3083a = new MultiModalGroupTicket();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MultiModalGroupTicket);
        }

        public final int hashCode() {
            return -1900882335;
        }

        public final String toString() {
            return "MultiModalGroupTicket";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/TableToCollect$OndcMetroTicket;", "Lapp/chalo/home/domain/TableToCollect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OndcMetroTicket extends TableToCollect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OndcMetroTicket f3084a = new OndcMetroTicket();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/TableToCollect$OndcTicket;", "Lapp/chalo/home/domain/TableToCollect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OndcTicket extends TableToCollect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OndcTicket f3085a = new OndcTicket();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OndcTicket);
        }

        public final int hashCode() {
            return 2030087168;
        }

        public final String toString() {
            return "OndcTicket";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/TableToCollect$PassRide;", "Lapp/chalo/home/domain/TableToCollect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassRide extends TableToCollect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PassRide f3086a = new PassRide();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PassRide);
        }

        public final int hashCode() {
            return 658221791;
        }

        public final String toString() {
            return "PassRide";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/TableToCollect$PendingSuperPass;", "Lapp/chalo/home/domain/TableToCollect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PendingSuperPass extends TableToCollect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PendingSuperPass f3087a = new PendingSuperPass();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PendingSuperPass);
        }

        public final int hashCode() {
            return -1260599669;
        }

        public final String toString() {
            return "PendingSuperPass";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/TableToCollect$PremiumBusTicket;", "Lapp/chalo/home/domain/TableToCollect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumBusTicket extends TableToCollect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3088a;

        public PremiumBusTicket(boolean z) {
            this.f3088a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PremiumBusTicket) && this.f3088a == ((PremiumBusTicket) obj).f3088a;
        }

        public final int hashCode() {
            return this.f3088a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("PremiumBusTicket(includeUsedTillTripEndInActive=", ")", this.f3088a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/TableToCollect$QuickPay;", "Lapp/chalo/home/domain/TableToCollect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickPay extends TableToCollect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f3089a;

        public QuickPay(List walletsToInclude) {
            Intrinsics.i(walletsToInclude, "walletsToInclude");
            this.f3089a = walletsToInclude;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuickPay) && Intrinsics.d(this.f3089a, ((QuickPay) obj).f3089a);
        }

        public final int hashCode() {
            return this.f3089a.hashCode() + 38161;
        }

        public final String toString() {
            return r1.d("QuickPay(onlyIfWalletActive=true, walletsToInclude=", ")", this.f3089a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/TableToCollect$RideBasedSuperPass;", "Lapp/chalo/home/domain/TableToCollect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RideBasedSuperPass extends TableToCollect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RideBasedSuperPass f3090a = new RideBasedSuperPass();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RideBasedSuperPass);
        }

        public final int hashCode() {
            return -905246329;
        }

        public final String toString() {
            return "RideBasedSuperPass";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/TableToCollect$SuperPassApplication;", "Lapp/chalo/home/domain/TableToCollect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuperPassApplication extends TableToCollect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SuperPassApplication f3091a = new SuperPassApplication();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SuperPassApplication);
        }

        public final int hashCode() {
            return 77529274;
        }

        public final String toString() {
            return "SuperPassApplication";
        }
    }
}
