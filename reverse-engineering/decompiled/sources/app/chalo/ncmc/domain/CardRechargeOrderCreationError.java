package app.chalo.ncmc.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ncmc/domain/CardRechargeOrderCreationError;", "", "LocalError", "OrderCreationFailed", "GenericError", "Lapp/chalo/ncmc/domain/CardRechargeOrderCreationError$GenericError;", "Lapp/chalo/ncmc/domain/CardRechargeOrderCreationError$LocalError;", "Lapp/chalo/ncmc/domain/CardRechargeOrderCreationError$OrderCreationFailed;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CardRechargeOrderCreationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6211a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/CardRechargeOrderCreationError$GenericError;", "Lapp/chalo/ncmc/domain/CardRechargeOrderCreationError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenericError extends CardRechargeOrderCreationError {
        public final String b;

        public GenericError(String str) {
            super(str);
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenericError) && Intrinsics.d(this.b, ((GenericError) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("GenericError(errorMsg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/CardRechargeOrderCreationError$LocalError;", "Lapp/chalo/ncmc/domain/CardRechargeOrderCreationError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocalError extends CardRechargeOrderCreationError {
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/domain/CardRechargeOrderCreationError$OrderCreationFailed;", "Lapp/chalo/ncmc/domain/CardRechargeOrderCreationError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderCreationFailed extends CardRechargeOrderCreationError {
        public final String b;

        public OrderCreationFailed(String str) {
            super(str);
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderCreationFailed) && Intrinsics.d(this.b, ((OrderCreationFailed) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("OrderCreationFailed(errorMsg=", this.b, ")");
        }
    }

    public CardRechargeOrderCreationError(String str) {
        this.f6211a = str;
    }
}
