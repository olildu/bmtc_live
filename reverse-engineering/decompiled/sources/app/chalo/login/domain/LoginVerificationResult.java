package app.chalo.login.domain;

import app.chalo.userprofile.UserProfileAppModel;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/login/domain/LoginVerificationResult;", "", "LoginVerified", "LocalError", "ServerError", "TokenProcessingError", "Lapp/chalo/login/domain/LoginVerificationResult$LocalError;", "Lapp/chalo/login/domain/LoginVerificationResult$LoginVerified;", "Lapp/chalo/login/domain/LoginVerificationResult$ServerError;", "Lapp/chalo/login/domain/LoginVerificationResult$TokenProcessingError;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LoginVerificationResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/LoginVerificationResult$LocalError;", "Lapp/chalo/login/domain/LoginVerificationResult;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocalError extends LoginVerificationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5235a;

        public LocalError(String str) {
            this.f5235a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalError) && Intrinsics.d(this.f5235a, ((LocalError) obj).f5235a);
        }

        public final int hashCode() {
            String str = this.f5235a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("LocalError(errorMsg=", this.f5235a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/LoginVerificationResult$LoginVerified;", "Lapp/chalo/login/domain/LoginVerificationResult;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoginVerified extends LoginVerificationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserProfileAppModel f5236a;

        public LoginVerified(UserProfileAppModel userProfileAppModel) {
            this.f5236a = userProfileAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoginVerified) && Intrinsics.d(this.f5236a, ((LoginVerified) obj).f5236a);
        }

        public final int hashCode() {
            return this.f5236a.hashCode();
        }

        public final String toString() {
            return "LoginVerified(userProfile=" + this.f5236a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/login/domain/LoginVerificationResult$ServerError;", "Lapp/chalo/login/domain/LoginVerificationResult;", "InvalidOtpEntered", "UnknownError", "InvalidProfileReceived", "InvalidTokensReceived", "ParseError", "Lapp/chalo/login/domain/LoginVerificationResult$ServerError$InvalidOtpEntered;", "Lapp/chalo/login/domain/LoginVerificationResult$ServerError$InvalidProfileReceived;", "Lapp/chalo/login/domain/LoginVerificationResult$ServerError$InvalidTokensReceived;", "Lapp/chalo/login/domain/LoginVerificationResult$ServerError$ParseError;", "Lapp/chalo/login/domain/LoginVerificationResult$ServerError$UnknownError;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ServerError extends LoginVerificationResult {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/LoginVerificationResult$ServerError$InvalidOtpEntered;", "Lapp/chalo/login/domain/LoginVerificationResult$ServerError;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidOtpEntered extends ServerError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InvalidOtpEntered f5237a = new InvalidOtpEntered();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/LoginVerificationResult$ServerError$InvalidProfileReceived;", "Lapp/chalo/login/domain/LoginVerificationResult$ServerError;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidProfileReceived extends ServerError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InvalidProfileReceived f5238a = new InvalidProfileReceived();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/LoginVerificationResult$ServerError$InvalidTokensReceived;", "Lapp/chalo/login/domain/LoginVerificationResult$ServerError;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidTokensReceived extends ServerError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InvalidTokensReceived f5239a = new InvalidTokensReceived();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/LoginVerificationResult$ServerError$ParseError;", "Lapp/chalo/login/domain/LoginVerificationResult$ServerError;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ParseError extends ServerError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ParseError f5240a = new ParseError();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/LoginVerificationResult$ServerError$UnknownError;", "Lapp/chalo/login/domain/LoginVerificationResult$ServerError;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnknownError extends ServerError {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f5241a;

            public UnknownError(String str) {
                this.f5241a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnknownError) && Intrinsics.d(this.f5241a, ((UnknownError) obj).f5241a);
            }

            public final int hashCode() {
                String str = this.f5241a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("UnknownError(errorMsg=", this.f5241a, ")");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/LoginVerificationResult$TokenProcessingError;", "Lapp/chalo/login/domain/LoginVerificationResult;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TokenProcessingError extends LoginVerificationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TokenProcessingError f5242a = new TokenProcessingError();
    }

    public final int a() {
        if (this instanceof LoginVerified) {
            return -1;
        }
        if (equals(ServerError.InvalidTokensReceived.f5239a)) {
            return 106;
        }
        if (this instanceof LocalError) {
            return 108;
        }
        if (equals(ServerError.InvalidOtpEntered.f5237a)) {
            return 109;
        }
        if (this instanceof ServerError.UnknownError) {
            return 105;
        }
        if (equals(TokenProcessingError.f5242a)) {
            return 107;
        }
        if (equals(ServerError.InvalidProfileReceived.f5238a)) {
            return FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD;
        }
        if (equals(ServerError.ParseError.f5240a)) {
            return FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION;
        }
        throw new NoWhenBranchMatchedException();
    }
}
