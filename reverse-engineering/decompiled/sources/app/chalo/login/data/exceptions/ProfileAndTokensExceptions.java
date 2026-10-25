package app.chalo.login.data.exceptions;

import androidx.core.app.NotificationCompat;
import app.chalo.login.data.models.response.UserProfileResponseModel;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\b\t\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/login/data/exceptions/ProfileAndTokensExceptions;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "InvalidAccessToken", "InvalidRefreshToken", "InvalidProfileDetails", "Lapp/chalo/login/data/exceptions/ProfileAndTokensExceptions$InvalidAccessToken;", "Lapp/chalo/login/data/exceptions/ProfileAndTokensExceptions$InvalidProfileDetails;", "Lapp/chalo/login/data/exceptions/ProfileAndTokensExceptions$InvalidRefreshToken;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProfileAndTokensExceptions extends Exception {
    private final String msg;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lapp/chalo/login/data/exceptions/ProfileAndTokensExceptions$InvalidAccessToken;", "Lapp/chalo/login/data/exceptions/ProfileAndTokensExceptions;", "", "tokenReceived", "Ljava/lang/String;", "getTokenReceived", "()Ljava/lang/String;", NotificationCompat.CATEGORY_MESSAGE, "getMsg", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidAccessToken extends ProfileAndTokensExceptions {
        private final String msg;
        private final String tokenReceived;

        public InvalidAccessToken(String str) {
            super("null or empty access token received");
            this.tokenReceived = str;
            this.msg = "null or empty access token received";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidAccessToken)) {
                return false;
            }
            InvalidAccessToken invalidAccessToken = (InvalidAccessToken) obj;
            return Intrinsics.d(this.tokenReceived, invalidAccessToken.tokenReceived) && Intrinsics.d(this.msg, invalidAccessToken.msg);
        }

        public final int hashCode() {
            String str = this.tokenReceived;
            return this.msg.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return vo1.o("InvalidAccessToken(tokenReceived=", this.tokenReceived, ", msg=", this.msg, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/login/data/exceptions/ProfileAndTokensExceptions$InvalidProfileDetails;", "Lapp/chalo/login/data/exceptions/ProfileAndTokensExceptions;", "Lapp/chalo/login/data/models/response/UserProfileResponseModel;", "profileReceived", "Lapp/chalo/login/data/models/response/UserProfileResponseModel;", "getProfileReceived", "()Lapp/chalo/login/data/models/response/UserProfileResponseModel;", "", NotificationCompat.CATEGORY_MESSAGE, "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidProfileDetails extends ProfileAndTokensExceptions {
        private final String msg;
        private final UserProfileResponseModel profileReceived;

        public InvalidProfileDetails(UserProfileResponseModel userProfileResponseModel, String str) {
            super(str);
            this.profileReceived = userProfileResponseModel;
            this.msg = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidProfileDetails)) {
                return false;
            }
            InvalidProfileDetails invalidProfileDetails = (InvalidProfileDetails) obj;
            return Intrinsics.d(this.profileReceived, invalidProfileDetails.profileReceived) && Intrinsics.d(this.msg, invalidProfileDetails.msg);
        }

        public final int hashCode() {
            UserProfileResponseModel userProfileResponseModel = this.profileReceived;
            return this.msg.hashCode() + ((userProfileResponseModel == null ? 0 : userProfileResponseModel.hashCode()) * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "InvalidProfileDetails(profileReceived=" + this.profileReceived + ", msg=" + this.msg + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lapp/chalo/login/data/exceptions/ProfileAndTokensExceptions$InvalidRefreshToken;", "Lapp/chalo/login/data/exceptions/ProfileAndTokensExceptions;", "", "tokenReceived", "Ljava/lang/String;", "getTokenReceived", "()Ljava/lang/String;", NotificationCompat.CATEGORY_MESSAGE, "getMsg", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidRefreshToken extends ProfileAndTokensExceptions {
        private final String msg;
        private final String tokenReceived;

        public InvalidRefreshToken(String str) {
            super("null or empty refresh token received");
            this.tokenReceived = str;
            this.msg = "null or empty refresh token received";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidRefreshToken)) {
                return false;
            }
            InvalidRefreshToken invalidRefreshToken = (InvalidRefreshToken) obj;
            return Intrinsics.d(this.tokenReceived, invalidRefreshToken.tokenReceived) && Intrinsics.d(this.msg, invalidRefreshToken.msg);
        }

        public final int hashCode() {
            String str = this.tokenReceived;
            return this.msg.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return vo1.o("InvalidRefreshToken(tokenReceived=", this.tokenReceived, ", msg=", this.msg, ")");
        }
    }

    public ProfileAndTokensExceptions(String str) {
        super(str);
        this.msg = str;
    }
}
