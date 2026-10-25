package app.chalo.premiumbus.domain;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.r1;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult;", "", InitializationStatus.SUCCESS, "NoStopPointsAvailable", "ServerError", "ResponseParseException", "LocalException", "UnknownException", "Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult$LocalException;", "Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult$NoStopPointsAvailable;", "Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult$ResponseParseException;", "Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult$ServerError;", "Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult$Success;", "Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult$UnknownException;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FetchPBStopPointsResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult$LocalException;", "Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocalException extends FetchPBStopPointsResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocalException f7188a = new LocalException();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult$NoStopPointsAvailable;", "Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoStopPointsAvailable extends FetchPBStopPointsResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoStopPointsAvailable f7189a = new NoStopPointsAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult$ResponseParseException;", "Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseParseException extends FetchPBStopPointsResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResponseParseException f7190a = new ResponseParseException();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult$ServerError;", "Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends FetchPBStopPointsResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7191a;

        public ServerError(String str) {
            this.f7191a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && Intrinsics.d(this.f7191a, ((ServerError) obj).f7191a);
        }

        public final int hashCode() {
            String str = this.f7191a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ServerError(msg=", this.f7191a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult$Success;", "Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends FetchPBStopPointsResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7192a;

        public Success(List list) {
            this.f7192a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f7192a, ((Success) obj).f7192a);
        }

        public final int hashCode() {
            return this.f7192a.hashCode();
        }

        public final String toString() {
            return r1.d("Success(result=", ")", this.f7192a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult$UnknownException;", "Lapp/chalo/premiumbus/domain/FetchPBStopPointsResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnknownException extends FetchPBStopPointsResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnknownException f7193a = new UnknownException();
    }

    public final int a() {
        if (equals(NoStopPointsAvailable.f7189a)) {
            return 101;
        }
        if (this instanceof Success) {
            return -1;
        }
        if (this instanceof ServerError) {
            return 102;
        }
        if (equals(LocalException.f7188a)) {
            return FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD;
        }
        if (equals(ResponseParseException.f7190a)) {
            return FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION;
        }
        if (equals(UnknownException.f7193a)) {
            return 112;
        }
        throw new NoWhenBranchMatchedException();
    }
}
