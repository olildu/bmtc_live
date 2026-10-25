package app.chalo.mticket.domain;

import app.chalo.productpurchase.productselection.data.models.app.MTicketFareResponseAppModel;
import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/mticket/domain/MTicketFareFetchResult;", "", InitializationStatus.SUCCESS, "ServerError", "GeneralError", "Lapp/chalo/mticket/domain/MTicketFareFetchResult$GeneralError;", "Lapp/chalo/mticket/domain/MTicketFareFetchResult$ServerError;", "Lapp/chalo/mticket/domain/MTicketFareFetchResult$Success;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MTicketFareFetchResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/domain/MTicketFareFetchResult$GeneralError;", "Lapp/chalo/mticket/domain/MTicketFareFetchResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GeneralError extends MTicketFareFetchResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5727a;

        public GeneralError(String str) {
            this.f5727a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GeneralError) && Intrinsics.d(this.f5727a, ((GeneralError) obj).f5727a);
        }

        public final int hashCode() {
            String str = this.f5727a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("GeneralError(msg=", this.f5727a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/domain/MTicketFareFetchResult$ServerError;", "Lapp/chalo/mticket/domain/MTicketFareFetchResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends MTicketFareFetchResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5728a;

        public ServerError(String str) {
            this.f5728a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && Intrinsics.d(this.f5728a, ((ServerError) obj).f5728a);
        }

        public final int hashCode() {
            String str = this.f5728a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ServerError(msg=", this.f5728a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/domain/MTicketFareFetchResult$Success;", "Lapp/chalo/mticket/domain/MTicketFareFetchResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends MTicketFareFetchResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MTicketFareResponseAppModel f5729a;

        public Success(MTicketFareResponseAppModel data) {
            Intrinsics.i(data, "data");
            this.f5729a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f5729a, ((Success) obj).f5729a);
        }

        public final int hashCode() {
            return this.f5729a.hashCode();
        }

        public final String toString() {
            return "Success(data=" + this.f5729a + ")";
        }
    }
}
