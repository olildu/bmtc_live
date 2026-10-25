package app.chalo.premiumbus.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lapp/chalo/premiumbus/domain/ChangeStopFailureReason;", "", "ServerError", "LocalError", "ParseError", "UnknownError", "NoTicketReceived", "InvalidTicketReceived", "TicketParseError", "StopChangeWindowPassed", "StopNotEligible", "Companion", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$InvalidTicketReceived;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$LocalError;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$NoTicketReceived;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$ParseError;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$ServerError;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$StopChangeWindowPassed;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$StopNotEligible;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$TicketParseError;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$UnknownError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChangeStopFailureReason {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$Companion;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$InvalidTicketReceived;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidTicketReceived extends ChangeStopFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvalidTicketReceived f7173a = new InvalidTicketReceived();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidTicketReceived);
        }

        public final int hashCode() {
            return -969226383;
        }

        public final String toString() {
            return "InvalidTicketReceived";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$LocalError;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocalError extends ChangeStopFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocalError f7174a = new LocalError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LocalError);
        }

        public final int hashCode() {
            return -1333368080;
        }

        public final String toString() {
            return "LocalError";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$NoTicketReceived;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoTicketReceived extends ChangeStopFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoTicketReceived f7175a = new NoTicketReceived();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoTicketReceived);
        }

        public final int hashCode() {
            return 1805837441;
        }

        public final String toString() {
            return "NoTicketReceived";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$ParseError;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ParseError extends ChangeStopFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ParseError f7176a = new ParseError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ParseError);
        }

        public final int hashCode() {
            return 677248168;
        }

        public final String toString() {
            return "ParseError";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$ServerError;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends ChangeStopFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7177a;

        public ServerError(String str) {
            this.f7177a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && Intrinsics.d(this.f7177a, ((ServerError) obj).f7177a);
        }

        public final int hashCode() {
            String str = this.f7177a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ServerError(errorMessage=", this.f7177a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$StopChangeWindowPassed;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopChangeWindowPassed extends ChangeStopFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7178a;

        public StopChangeWindowPassed(String str) {
            this.f7178a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopChangeWindowPassed) && Intrinsics.d(this.f7178a, ((StopChangeWindowPassed) obj).f7178a);
        }

        public final int hashCode() {
            String str = this.f7178a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("StopChangeWindowPassed(errorMessage=", this.f7178a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$StopNotEligible;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StopNotEligible extends ChangeStopFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7179a;

        public StopNotEligible(String str) {
            this.f7179a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopNotEligible) && Intrinsics.d(this.f7179a, ((StopNotEligible) obj).f7179a);
        }

        public final int hashCode() {
            String str = this.f7179a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("StopNotEligible(errorMessage=", this.f7179a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$TicketParseError;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketParseError extends ChangeStopFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TicketParseError f7180a = new TicketParseError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TicketParseError);
        }

        public final int hashCode() {
            return -710333804;
        }

        public final String toString() {
            return "TicketParseError";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ChangeStopFailureReason$UnknownError;", "Lapp/chalo/premiumbus/domain/ChangeStopFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnknownError extends ChangeStopFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7181a;

        public UnknownError(String str) {
            this.f7181a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownError) && Intrinsics.d(this.f7181a, ((UnknownError) obj).f7181a);
        }

        public final int hashCode() {
            String str = this.f7181a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("UnknownError(errorMessage=", this.f7181a, ")");
        }
    }
}
