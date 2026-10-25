package app.chalo.premiumbus.domains;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/domains/PremiumTicketActivationStatus;", "", "Pre", "Post", "Lapp/chalo/premiumbus/domains/PremiumTicketActivationStatus$Post;", "Lapp/chalo/premiumbus/domains/PremiumTicketActivationStatus$Pre;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumTicketActivationStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7272a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domains/PremiumTicketActivationStatus$Post;", "Lapp/chalo/premiumbus/domains/PremiumTicketActivationStatus;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Post extends PremiumTicketActivationStatus {
        public final String b;
        public final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Post(String str, String stopId) {
            super(str);
            Intrinsics.i(stopId, "stopId");
            this.b = str;
            this.c = stopId;
        }

        @Override // app.chalo.premiumbus.domains.PremiumTicketActivationStatus
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF7272a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Post)) {
                return false;
            }
            Post post = (Post) obj;
            return Intrinsics.d(this.b, post.b) && Intrinsics.d(this.c, post.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("Post(bookingId=", this.b, ", stopId=", this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domains/PremiumTicketActivationStatus$Pre;", "Lapp/chalo/premiumbus/domains/PremiumTicketActivationStatus;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pre extends PremiumTicketActivationStatus {
        public final String b;

        public Pre(String str) {
            super(str);
            this.b = str;
        }

        @Override // app.chalo.premiumbus.domains.PremiumTicketActivationStatus
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF7272a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Pre) && Intrinsics.d(this.b, ((Pre) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("Pre(bookingId=", this.b, ")");
        }
    }

    public PremiumTicketActivationStatus(String str) {
        this.f7272a = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF7272a() {
        return this.f7272a;
    }
}
