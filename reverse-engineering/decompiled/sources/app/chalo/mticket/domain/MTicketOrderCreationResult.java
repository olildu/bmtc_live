package app.chalo.mticket.domain;

import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/mticket/domain/MTicketOrderCreationResult;", "", InitializationStatus.SUCCESS, "ServerError", "GeneralError", "Lapp/chalo/mticket/domain/MTicketOrderCreationResult$GeneralError;", "Lapp/chalo/mticket/domain/MTicketOrderCreationResult$ServerError;", "Lapp/chalo/mticket/domain/MTicketOrderCreationResult$Success;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MTicketOrderCreationResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/domain/MTicketOrderCreationResult$GeneralError;", "Lapp/chalo/mticket/domain/MTicketOrderCreationResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GeneralError extends MTicketOrderCreationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5730a;

        public GeneralError(String str) {
            this.f5730a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GeneralError) && Intrinsics.d(this.f5730a, ((GeneralError) obj).f5730a);
        }

        public final int hashCode() {
            String str = this.f5730a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("GeneralError(msg=", this.f5730a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/domain/MTicketOrderCreationResult$ServerError;", "Lapp/chalo/mticket/domain/MTicketOrderCreationResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends MTicketOrderCreationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5731a;

        public ServerError(String errorMsg) {
            Intrinsics.i(errorMsg, "errorMsg");
            this.f5731a = errorMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && Intrinsics.d(this.f5731a, ((ServerError) obj).f5731a);
        }

        public final int hashCode() {
            return this.f5731a.hashCode();
        }

        public final String toString() {
            return vo1.B("ServerError(errorMsg=", this.f5731a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/domain/MTicketOrderCreationResult$Success;", "Lapp/chalo/mticket/domain/MTicketOrderCreationResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends MTicketOrderCreationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreateOrderResponseAppModel f5732a;

        static {
            CreateOrderResponseAppModel.Companion companion = CreateOrderResponseAppModel.INSTANCE;
        }

        public Success(CreateOrderResponseAppModel response) {
            Intrinsics.i(response, "response");
            this.f5732a = response;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f5732a, ((Success) obj).f5732a);
        }

        public final int hashCode() {
            return this.f5732a.hashCode();
        }

        public final String toString() {
            return "Success(response=" + this.f5732a + ")";
        }
    }
}
