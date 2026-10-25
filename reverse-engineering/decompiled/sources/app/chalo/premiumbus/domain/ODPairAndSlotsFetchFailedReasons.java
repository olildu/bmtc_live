package app.chalo.premiumbus.domain;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons;", "", "NoStopPointsAvailable", "ServerError", "ResponseParseException", "LocalException", "UnknownException", "InvalidWindow", "UserNotFound", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$InvalidWindow;", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$LocalException;", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$NoStopPointsAvailable;", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$ResponseParseException;", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$ServerError;", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$UnknownException;", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$UserNotFound;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ODPairAndSlotsFetchFailedReasons {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$InvalidWindow;", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidWindow extends ODPairAndSlotsFetchFailedReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvalidWindow f7208a = new InvalidWindow();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$LocalException;", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocalException extends ODPairAndSlotsFetchFailedReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocalException f7209a = new LocalException();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$NoStopPointsAvailable;", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoStopPointsAvailable extends ODPairAndSlotsFetchFailedReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoStopPointsAvailable f7210a = new NoStopPointsAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$ResponseParseException;", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseParseException extends ODPairAndSlotsFetchFailedReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResponseParseException f7211a = new ResponseParseException();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$ServerError;", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends ODPairAndSlotsFetchFailedReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7212a;

        public ServerError(String str) {
            this.f7212a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && Intrinsics.d(this.f7212a, ((ServerError) obj).f7212a);
        }

        public final int hashCode() {
            String str = this.f7212a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ServerError(msg=", this.f7212a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$UnknownException;", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnknownException extends ODPairAndSlotsFetchFailedReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnknownException f7213a = new UnknownException();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons$UserNotFound;", "Lapp/chalo/premiumbus/domain/ODPairAndSlotsFetchFailedReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserNotFound extends ODPairAndSlotsFetchFailedReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserNotFound f7214a = new UserNotFound();
    }

    public final int a() {
        if (equals(NoStopPointsAvailable.f7210a)) {
            return 101;
        }
        if (this instanceof ServerError) {
            return 102;
        }
        if (equals(LocalException.f7209a)) {
            return FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD;
        }
        if (equals(ResponseParseException.f7211a)) {
            return FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION;
        }
        if (equals(UnknownException.f7213a)) {
            return 112;
        }
        if (equals(InvalidWindow.f7208a)) {
            return 108;
        }
        if (equals(UserNotFound.f7214a)) {
            return 112;
        }
        throw new NoWhenBranchMatchedException();
    }
}
