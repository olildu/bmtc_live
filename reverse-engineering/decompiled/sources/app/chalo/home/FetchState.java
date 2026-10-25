package app.chalo.home;

import defpackage.hq0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/home/FetchState;", "", "InProgress", "Fetched", "Failed", "NotApplicable", "NotLoggedIn", "Unknown", "Lapp/chalo/home/FetchState$Failed;", "Lapp/chalo/home/FetchState$Fetched;", "Lapp/chalo/home/FetchState$InProgress;", "Lapp/chalo/home/FetchState$NotApplicable;", "Lapp/chalo/home/FetchState$NotLoggedIn;", "Lapp/chalo/home/FetchState$Unknown;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FetchState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/FetchState$Failed;", "Lapp/chalo/home/FetchState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failed extends FetchState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2853a;

        public Failed(long j) {
            this.f2853a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && this.f2853a == ((Failed) obj).f2853a;
        }

        public final int hashCode() {
            long j = this.f2853a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f2853a, "Failed(timeStamp=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/FetchState$Fetched;", "Lapp/chalo/home/FetchState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Fetched extends FetchState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2854a;

        public Fetched(long j) {
            this.f2854a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Fetched) && this.f2854a == ((Fetched) obj).f2854a;
        }

        public final int hashCode() {
            long j = this.f2854a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f2854a, "Fetched(timeStamp=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/FetchState$InProgress;", "Lapp/chalo/home/FetchState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InProgress extends FetchState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2855a;

        public InProgress(long j) {
            this.f2855a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InProgress) && this.f2855a == ((InProgress) obj).f2855a;
        }

        public final int hashCode() {
            long j = this.f2855a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f2855a, "InProgress(timeStamp=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/FetchState$NotApplicable;", "Lapp/chalo/home/FetchState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotApplicable extends FetchState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2856a;

        public NotApplicable(long j) {
            this.f2856a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotApplicable) && this.f2856a == ((NotApplicable) obj).f2856a;
        }

        public final int hashCode() {
            long j = this.f2856a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f2856a, "NotApplicable(timeStamp=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/FetchState$NotLoggedIn;", "Lapp/chalo/home/FetchState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotLoggedIn extends FetchState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f2857a;

        public NotLoggedIn(long j) {
            this.f2857a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotLoggedIn) && this.f2857a == ((NotLoggedIn) obj).f2857a;
        }

        public final int hashCode() {
            long j = this.f2857a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f2857a, "NotLoggedIn(timeStamp=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/FetchState$Unknown;", "Lapp/chalo/home/FetchState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unknown extends FetchState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f2858a = new Unknown();
    }
}
