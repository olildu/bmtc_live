package app.chalo.juspay;

import defpackage.cb0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/juspay/JuspayOperationUpdate;", "", "Started", "Loading", "Completed", "Failed", "Rejected", "Abandoned", "Lapp/chalo/juspay/JuspayOperationUpdate$Abandoned;", "Lapp/chalo/juspay/JuspayOperationUpdate$Completed;", "Lapp/chalo/juspay/JuspayOperationUpdate$Failed;", "Lapp/chalo/juspay/JuspayOperationUpdate$Loading;", "Lapp/chalo/juspay/JuspayOperationUpdate$Rejected;", "Lapp/chalo/juspay/JuspayOperationUpdate$Started;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface JuspayOperationUpdate {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationUpdate$Abandoned;", "Lapp/chalo/juspay/JuspayOperationUpdate;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Abandoned implements JuspayOperationUpdate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Abandoned f4060a = new Abandoned();

        @Override // app.chalo.juspay.JuspayOperationUpdate
        public final /* bridge */ boolean a() {
            return DefaultImpls.a(this);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Abandoned);
        }

        public final int hashCode() {
            return -1841105788;
        }

        public final String toString() {
            return "Abandoned";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationUpdate$Completed;", "Lapp/chalo/juspay/JuspayOperationUpdate;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Completed implements JuspayOperationUpdate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuspayOperationResult f4061a;

        public Completed(JuspayOperationResult juspayOperationResult) {
            this.f4061a = juspayOperationResult;
        }

        @Override // app.chalo.juspay.JuspayOperationUpdate
        public final /* bridge */ boolean a() {
            return DefaultImpls.a(this);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Completed) && Intrinsics.d(this.f4061a, ((Completed) obj).f4061a);
        }

        public final int hashCode() {
            return this.f4061a.hashCode();
        }

        public final String toString() {
            return "Completed(result=" + this.f4061a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean a(JuspayOperationUpdate juspayOperationUpdate) {
            return (juspayOperationUpdate instanceof Completed) || (juspayOperationUpdate instanceof Failed) || (juspayOperationUpdate instanceof Rejected) || (juspayOperationUpdate instanceof Abandoned);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationUpdate$Failed;", "Lapp/chalo/juspay/JuspayOperationUpdate;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failed implements JuspayOperationUpdate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuspayOperationFailure f4062a;

        public Failed(JuspayOperationFailure juspayOperationFailure) {
            this.f4062a = juspayOperationFailure;
        }

        @Override // app.chalo.juspay.JuspayOperationUpdate
        public final /* bridge */ boolean a() {
            return DefaultImpls.a(this);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && Intrinsics.d(this.f4062a, ((Failed) obj).f4062a);
        }

        public final int hashCode() {
            return this.f4062a.hashCode();
        }

        public final String toString() {
            return "Failed(failure=" + this.f4062a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationUpdate$Loading;", "Lapp/chalo/juspay/JuspayOperationUpdate;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading implements JuspayOperationUpdate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f4063a;

        public Loading(boolean z) {
            this.f4063a = z;
        }

        @Override // app.chalo.juspay.JuspayOperationUpdate
        public final /* bridge */ boolean a() {
            return DefaultImpls.a(this);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.f4063a == ((Loading) obj).f4063a;
        }

        public final int hashCode() {
            return this.f4063a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("Loading(isLoading=", ")", this.f4063a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationUpdate$Rejected;", "Lapp/chalo/juspay/JuspayOperationUpdate;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Rejected implements JuspayOperationUpdate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Rejected f4064a = new Rejected();

        @Override // app.chalo.juspay.JuspayOperationUpdate
        public final /* bridge */ boolean a() {
            return DefaultImpls.a(this);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Rejected);
        }

        public final int hashCode() {
            return -1325327410;
        }

        public final String toString() {
            return "Rejected";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationUpdate$Started;", "Lapp/chalo/juspay/JuspayOperationUpdate;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Started implements JuspayOperationUpdate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Started f4065a = new Started();

        @Override // app.chalo.juspay.JuspayOperationUpdate
        public final /* bridge */ boolean a() {
            return DefaultImpls.a(this);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Started);
        }

        public final int hashCode() {
            return -534835407;
        }

        public final String toString() {
            return "Started";
        }
    }

    boolean a();
}
