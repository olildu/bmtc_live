package app.chalo.productbooking.common.domain;

import androidx.compose.runtime.ComposerKt;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason;", "", "ApiToAppMappingError", "ServerError", "LocalError", "ParseError", "UnknownError", "NoAdultFareFound", "Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason$ApiToAppMappingError;", "Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason$LocalError;", "Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason$NoAdultFareFound;", "Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason$ParseError;", "Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason$ServerError;", "Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason$UnknownError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CompleteProductConfigFetchFailedReason {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason$ApiToAppMappingError;", "Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ApiToAppMappingError extends CompleteProductConfigFetchFailedReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApiToAppMappingError f8253a = new ApiToAppMappingError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason$LocalError;", "Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocalError extends CompleteProductConfigFetchFailedReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocalError f8254a = new LocalError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason$NoAdultFareFound;", "Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoAdultFareFound extends CompleteProductConfigFetchFailedReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoAdultFareFound f8255a = new NoAdultFareFound();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason$ParseError;", "Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParseError extends CompleteProductConfigFetchFailedReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ParseError f8256a = new ParseError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason$ServerError;", "Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends CompleteProductConfigFetchFailedReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8257a;

        public ServerError(String str) {
            this.f8257a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && Intrinsics.d(this.f8257a, ((ServerError) obj).f8257a);
        }

        public final int hashCode() {
            String str = this.f8257a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ServerError(errorMsg=", this.f8257a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason$UnknownError;", "Lapp/chalo/productbooking/common/domain/CompleteProductConfigFetchFailedReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnknownError extends CompleteProductConfigFetchFailedReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnknownError f8258a = new UnknownError();
    }

    public final int a() {
        if (equals(ApiToAppMappingError.f8253a)) {
            return ComposerKt.providerKey;
        }
        if (this instanceof ServerError) {
            return ComposerKt.compositionLocalMapKey;
        }
        if (equals(LocalError.f8254a)) {
            return ComposerKt.providerValuesKey;
        }
        if (equals(ParseError.f8256a)) {
            return ComposerKt.providerMapsKey;
        }
        if (equals(UnknownError.f8258a)) {
            return 205;
        }
        if (equals(NoAdultFareFound.f8255a)) {
            return 215;
        }
        throw new NoWhenBranchMatchedException();
    }
}
