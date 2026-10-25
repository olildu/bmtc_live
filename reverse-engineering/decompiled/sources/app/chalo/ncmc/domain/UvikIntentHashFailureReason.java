package app.chalo.ncmc.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/ncmc/domain/UvikIntentHashFailureReason;", "", "UserNotLoggedIn", "ResponseParseError", "LocalError", "ApiFailure", "Lapp/chalo/ncmc/domain/UvikIntentHashFailureReason$ApiFailure;", "Lapp/chalo/ncmc/domain/UvikIntentHashFailureReason$LocalError;", "Lapp/chalo/ncmc/domain/UvikIntentHashFailureReason$ResponseParseError;", "Lapp/chalo/ncmc/domain/UvikIntentHashFailureReason$UserNotLoggedIn;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UvikIntentHashFailureReason {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6251a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/UvikIntentHashFailureReason$ApiFailure;", "Lapp/chalo/ncmc/domain/UvikIntentHashFailureReason;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ApiFailure extends UvikIntentHashFailureReason {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApiFailure(String errorMsg) {
            super(errorMsg);
            Intrinsics.i(errorMsg, "errorMsg");
            this.b = errorMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiFailure) && Intrinsics.d(this.b, ((ApiFailure) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("ApiFailure(errorMsg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/UvikIntentHashFailureReason$LocalError;", "Lapp/chalo/ncmc/domain/UvikIntentHashFailureReason;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocalError extends UvikIntentHashFailureReason {
        public final String b;

        public LocalError(String str) {
            super(str);
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalError) && Intrinsics.d(this.b, ((LocalError) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("LocalError(errorMsg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/UvikIntentHashFailureReason$ResponseParseError;", "Lapp/chalo/ncmc/domain/UvikIntentHashFailureReason;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseParseError extends UvikIntentHashFailureReason {
        public static final ResponseParseError b = new ResponseParseError("Something went wrong");
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/UvikIntentHashFailureReason$UserNotLoggedIn;", "Lapp/chalo/ncmc/domain/UvikIntentHashFailureReason;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserNotLoggedIn extends UvikIntentHashFailureReason {
        public static final UserNotLoggedIn b = new UserNotLoggedIn("Something went wrong");
    }

    public UvikIntentHashFailureReason(String str) {
        this.f6251a = str;
    }
}
