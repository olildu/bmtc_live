package app.chalo.premiumbus.bulkbookingridedetails.domain;

import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError;", "", "LocalError", "ParseError", "InvalidData", "ServerError", "UnknownError", "Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError$InvalidData;", "Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError$LocalError;", "Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError$ParseError;", "Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError$ServerError;", "Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError$UnknownError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UpdatePassStartDateError {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError$InvalidData;", "Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidData extends UpdatePassStartDateError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6898a;
        public final String b;
        public final String c;

        public InvalidData(int i, String errorTitle, String errorMessage) {
            Intrinsics.i(errorTitle, "errorTitle");
            Intrinsics.i(errorMessage, "errorMessage");
            this.f6898a = i;
            this.b = errorTitle;
            this.c = errorMessage;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF6902a() {
            return this.f6898a;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidData)) {
                return false;
            }
            InvalidData invalidData = (InvalidData) obj;
            return this.f6898a == invalidData.f6898a && Intrinsics.d(this.b, invalidData.b) && Intrinsics.d(this.c, invalidData.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f6898a * 31, 31, this.b);
        }

        public final String toString() {
            return vo1.p(nf1.p(this.f6898a, "InvalidData(errorCodes=", ", errorTitle=", this.b, ", errorMessage="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError$LocalError;", "Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocalError extends UpdatePassStartDateError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6899a;
        public final String b;
        public final String c;

        public LocalError(int i, String errorTitle, String errorMessage) {
            Intrinsics.i(errorTitle, "errorTitle");
            Intrinsics.i(errorMessage, "errorMessage");
            this.f6899a = i;
            this.b = errorTitle;
            this.c = errorMessage;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF6902a() {
            return this.f6899a;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalError)) {
                return false;
            }
            LocalError localError = (LocalError) obj;
            return this.f6899a == localError.f6899a && Intrinsics.d(this.b, localError.b) && Intrinsics.d(this.c, localError.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f6899a * 31, 31, this.b);
        }

        public final String toString() {
            return vo1.p(nf1.p(this.f6899a, "LocalError(errorCodes=", ", errorTitle=", this.b, ", errorMessage="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError$ParseError;", "Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ParseError extends UpdatePassStartDateError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6900a;
        public final String b;
        public final String c;

        public ParseError(int i, String errorTitle, String errorMessage) {
            Intrinsics.i(errorTitle, "errorTitle");
            Intrinsics.i(errorMessage, "errorMessage");
            this.f6900a = i;
            this.b = errorTitle;
            this.c = errorMessage;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF6902a() {
            return this.f6900a;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParseError)) {
                return false;
            }
            ParseError parseError = (ParseError) obj;
            return this.f6900a == parseError.f6900a && Intrinsics.d(this.b, parseError.b) && Intrinsics.d(this.c, parseError.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f6900a * 31, 31, this.b);
        }

        public final String toString() {
            return vo1.p(nf1.p(this.f6900a, "ParseError(errorCodes=", ", errorTitle=", this.b, ", errorMessage="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError$ServerError;", "Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends UpdatePassStartDateError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6901a;
        public final String b;
        public final String c;

        public ServerError(int i, String errorTitle, String errorMessage) {
            Intrinsics.i(errorTitle, "errorTitle");
            Intrinsics.i(errorMessage, "errorMessage");
            this.f6901a = i;
            this.b = errorTitle;
            this.c = errorMessage;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF6902a() {
            return this.f6901a;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServerError)) {
                return false;
            }
            ServerError serverError = (ServerError) obj;
            return this.f6901a == serverError.f6901a && Intrinsics.d(this.b, serverError.b) && Intrinsics.d(this.c, serverError.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f6901a * 31, 31, this.b);
        }

        public final String toString() {
            return vo1.p(nf1.p(this.f6901a, "ServerError(errorCodes=", ", errorTitle=", this.b, ", errorMessage="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError$UnknownError;", "Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnknownError extends UpdatePassStartDateError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6902a;
        public final String b;
        public final String c;

        public UnknownError(int i, String errorTitle, String errorMessage) {
            Intrinsics.i(errorTitle, "errorTitle");
            Intrinsics.i(errorMessage, "errorMessage");
            this.f6902a = i;
            this.b = errorTitle;
            this.c = errorMessage;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getF6902a() {
            return this.f6902a;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnknownError)) {
                return false;
            }
            UnknownError unknownError = (UnknownError) obj;
            return this.f6902a == unknownError.f6902a && Intrinsics.d(this.b, unknownError.b) && Intrinsics.d(this.c, unknownError.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f6902a * 31, 31, this.b);
        }

        public final String toString() {
            return vo1.p(nf1.p(this.f6902a, "UnknownError(errorCodes=", ", errorTitle=", this.b, ", errorMessage="), this.c, ")");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int getF6902a();

    /* JADX INFO: renamed from: b */
    public abstract String getC();

    /* JADX INFO: renamed from: c */
    public abstract String getB();
}
