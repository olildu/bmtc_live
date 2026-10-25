package app.chalo.home.domain;

import defpackage.cb0;
import defpackage.n21;
import defpackage.nf1;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lapp/chalo/home/domain/UserBookingsRequestType;", "", "MobileTicketType", "SuperPassType", "QuickPayType", "InstantTicketType", "PremiumBusTicketType", "MultiModalGroupTicketType", "OndcTicketType", "OndcMetroTicketType", "MetroTicket", "SuperPassRideType", "Companion", "Lapp/chalo/home/domain/UserBookingsRequestType$InstantTicketType;", "Lapp/chalo/home/domain/UserBookingsRequestType$MetroTicket;", "Lapp/chalo/home/domain/UserBookingsRequestType$MobileTicketType;", "Lapp/chalo/home/domain/UserBookingsRequestType$MultiModalGroupTicketType;", "Lapp/chalo/home/domain/UserBookingsRequestType$OndcMetroTicketType;", "Lapp/chalo/home/domain/UserBookingsRequestType$OndcTicketType;", "Lapp/chalo/home/domain/UserBookingsRequestType$PremiumBusTicketType;", "Lapp/chalo/home/domain/UserBookingsRequestType$QuickPayType;", "Lapp/chalo/home/domain/UserBookingsRequestType$SuperPassRideType;", "Lapp/chalo/home/domain/UserBookingsRequestType$SuperPassType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UserBookingsRequestType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/UserBookingsRequestType$Companion;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static Set a() {
            return ArraysKt.j0(new UserBookingsRequestType[]{MobileTicketType.f3095a, new SuperPassType(true, true, true, true), new QuickPayType(), InstantTicketType.f3093a, new PremiumBusTicketType(false), OndcTicketType.f3098a, OndcMetroTicketType.f3097a, MetroTicket.f3094a, SuperPassRideType.f3100a, MultiModalGroupTicketType.f3096a});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/UserBookingsRequestType$InstantTicketType;", "Lapp/chalo/home/domain/UserBookingsRequestType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InstantTicketType extends UserBookingsRequestType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstantTicketType f3093a = new InstantTicketType();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/UserBookingsRequestType$MetroTicket;", "Lapp/chalo/home/domain/UserBookingsRequestType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MetroTicket extends UserBookingsRequestType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MetroTicket f3094a = new MetroTicket();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/UserBookingsRequestType$MobileTicketType;", "Lapp/chalo/home/domain/UserBookingsRequestType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MobileTicketType extends UserBookingsRequestType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MobileTicketType f3095a = new MobileTicketType();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/UserBookingsRequestType$MultiModalGroupTicketType;", "Lapp/chalo/home/domain/UserBookingsRequestType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MultiModalGroupTicketType extends UserBookingsRequestType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MultiModalGroupTicketType f3096a = new MultiModalGroupTicketType();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/UserBookingsRequestType$OndcMetroTicketType;", "Lapp/chalo/home/domain/UserBookingsRequestType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OndcMetroTicketType extends UserBookingsRequestType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OndcMetroTicketType f3097a = new OndcMetroTicketType();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/UserBookingsRequestType$OndcTicketType;", "Lapp/chalo/home/domain/UserBookingsRequestType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OndcTicketType extends UserBookingsRequestType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OndcTicketType f3098a = new OndcTicketType();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/UserBookingsRequestType$PremiumBusTicketType;", "Lapp/chalo/home/domain/UserBookingsRequestType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumBusTicketType extends UserBookingsRequestType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3099a;

        public PremiumBusTicketType(boolean z) {
            this.f3099a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PremiumBusTicketType) && this.f3099a == ((PremiumBusTicketType) obj).f3099a;
        }

        public final int hashCode() {
            return this.f3099a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("PremiumBusTicketType(includeUsedTillTripEndInActive=", ")", this.f3099a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/UserBookingsRequestType$QuickPayType;", "Lapp/chalo/home/domain/UserBookingsRequestType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickPayType extends UserBookingsRequestType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof QuickPayType);
        }

        public final int hashCode() {
            return 38161;
        }

        public final String toString() {
            return "QuickPayType(onlyIfWalletActive=true, walletsToInclude=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/UserBookingsRequestType$SuperPassRideType;", "Lapp/chalo/home/domain/UserBookingsRequestType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuperPassRideType extends UserBookingsRequestType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SuperPassRideType f3100a = new SuperPassRideType();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/UserBookingsRequestType$SuperPassType;", "Lapp/chalo/home/domain/UserBookingsRequestType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuperPassType extends UserBookingsRequestType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f3101a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public SuperPassType(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f3101a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperPassType)) {
                return false;
            }
            SuperPassType superPassType = (SuperPassType) obj;
            return this.f3101a == superPassType.f3101a && this.b == superPassType.b && this.c == superPassType.c && this.d == superPassType.d;
        }

        public final int hashCode() {
            return ((((((this.f3101a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237);
        }

        public final String toString() {
            return n21.h(nf1.r("SuperPassType(includeRideBasedPass=", ", includeMagicPass=", ", includePendingPasses=", this.f3101a, this.b), this.c, ", includePassApplications=", this.d, ")");
        }
    }
}
