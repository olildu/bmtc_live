package app.chalo.juspay;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/juspay/JuspayUpiSessionState;", "", "Unknown", "Fetching", "Available", "Unavailable", "Expired", "Abandoned", "Lapp/chalo/juspay/JuspayUpiSessionState$Abandoned;", "Lapp/chalo/juspay/JuspayUpiSessionState$Available;", "Lapp/chalo/juspay/JuspayUpiSessionState$Expired;", "Lapp/chalo/juspay/JuspayUpiSessionState$Fetching;", "Lapp/chalo/juspay/JuspayUpiSessionState$Unavailable;", "Lapp/chalo/juspay/JuspayUpiSessionState$Unknown;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface JuspayUpiSessionState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayUpiSessionState$Abandoned;", "Lapp/chalo/juspay/JuspayUpiSessionState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Abandoned implements JuspayUpiSessionState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Abandoned f4078a = new Abandoned();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Abandoned);
        }

        public final int hashCode() {
            return -1981666275;
        }

        public final String toString() {
            return "Abandoned";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayUpiSessionState$Available;", "Lapp/chalo/juspay/JuspayUpiSessionState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Available implements JuspayUpiSessionState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JusPayResultDataType.UpiSessionToken f4079a;

        public Available(JusPayResultDataType.UpiSessionToken upiSessionToken) {
            this.f4079a = upiSessionToken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Available) && Intrinsics.d(this.f4079a, ((Available) obj).f4079a);
        }

        public final int hashCode() {
            return this.f4079a.hashCode();
        }

        public final String toString() {
            return "Available(data=" + this.f4079a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayUpiSessionState$Expired;", "Lapp/chalo/juspay/JuspayUpiSessionState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Expired implements JuspayUpiSessionState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Expired f4080a = new Expired();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Expired);
        }

        public final int hashCode() {
            return 339001262;
        }

        public final String toString() {
            return "Expired";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayUpiSessionState$Fetching;", "Lapp/chalo/juspay/JuspayUpiSessionState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Fetching implements JuspayUpiSessionState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Fetching f4081a = new Fetching();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Fetching);
        }

        public final int hashCode() {
            return -207071361;
        }

        public final String toString() {
            return "Fetching";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayUpiSessionState$Unavailable;", "Lapp/chalo/juspay/JuspayUpiSessionState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unavailable implements JuspayUpiSessionState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4082a;

        public Unavailable(String str) {
            this.f4082a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unavailable) && Intrinsics.d(this.f4082a, ((Unavailable) obj).f4082a);
        }

        public final int hashCode() {
            String str = this.f4082a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Unavailable(reason=", this.f4082a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayUpiSessionState$Unknown;", "Lapp/chalo/juspay/JuspayUpiSessionState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown implements JuspayUpiSessionState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f4083a = new Unknown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return 1363395795;
        }

        public final String toString() {
            return "Unknown";
        }
    }
}
