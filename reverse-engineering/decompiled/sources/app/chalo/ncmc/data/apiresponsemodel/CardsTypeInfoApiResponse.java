package app.chalo.ncmc.data.apiresponsemodel;

import app.chalo.ncmc.deserializer.ChaloCardsInfoDeserializer;
import defpackage.r1;
import defpackage.sf;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse;", "", "Companion", "SemiClosed", "Closed", "Open", "Unknown", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$Closed;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$Open;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$SemiClosed;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$Unknown;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable(with = ChaloCardsInfoDeserializer.class)
public abstract class CardsTypeInfoApiResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$Closed;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Closed extends CardsTypeInfoApiResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(5))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6071a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$Closed$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$Closed;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Closed> serializer() {
                return CardsTypeInfoApiResponse$Closed$$serializer.f6072a;
            }
        }

        public Closed(int i, List list) {
            if (1 == (i & 1)) {
                this.f6071a = list;
            } else {
                PluginExceptionsKt.b(CardsTypeInfoApiResponse$Closed$$serializer.f6072a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.ncmc.data.apiresponsemodel.CardsTypeInfoApiResponse
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF6077a() {
            return this.f6071a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Closed) && Intrinsics.d(this.f6071a, ((Closed) obj).f6071a);
        }

        public final int hashCode() {
            return this.f6071a.hashCode();
        }

        public final String toString() {
            return r1.d("Closed(cardList=", ")", this.f6071a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardsTypeInfoApiResponse> serializer() {
            return ChaloCardsInfoDeserializer.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$Open;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Open extends CardsTypeInfoApiResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(6))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6073a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$Open$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$Open;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Open> serializer() {
                return CardsTypeInfoApiResponse$Open$$serializer.f6074a;
            }
        }

        public Open(int i, List list) {
            if (1 == (i & 1)) {
                this.f6073a = list;
            } else {
                PluginExceptionsKt.b(CardsTypeInfoApiResponse$Open$$serializer.f6074a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.ncmc.data.apiresponsemodel.CardsTypeInfoApiResponse
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF6077a() {
            return this.f6073a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Open) && Intrinsics.d(this.f6073a, ((Open) obj).f6073a);
        }

        public final int hashCode() {
            return this.f6073a.hashCode();
        }

        public final String toString() {
            return r1.d("Open(cardList=", ")", this.f6073a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$SemiClosed;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class SemiClosed extends CardsTypeInfoApiResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(7))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6075a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$SemiClosed$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$SemiClosed;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<SemiClosed> serializer() {
                return CardsTypeInfoApiResponse$SemiClosed$$serializer.f6076a;
            }
        }

        public SemiClosed(int i, List list) {
            if (1 == (i & 1)) {
                this.f6075a = list;
            } else {
                PluginExceptionsKt.b(CardsTypeInfoApiResponse$SemiClosed$$serializer.f6076a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.ncmc.data.apiresponsemodel.CardsTypeInfoApiResponse
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF6077a() {
            return this.f6075a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SemiClosed) && Intrinsics.d(this.f6075a, ((SemiClosed) obj).f6075a);
        }

        public final int hashCode() {
            return this.f6075a.hashCode();
        }

        public final String toString() {
            return r1.d("SemiClosed(cardList=", ")", this.f6075a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$Unknown;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Unknown extends CardsTypeInfoApiResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(8))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6077a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$Unknown$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardsTypeInfoApiResponse$Unknown;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Unknown> serializer() {
                return CardsTypeInfoApiResponse$Unknown$$serializer.f6078a;
            }
        }

        public Unknown(int i, List list) {
            if (1 == (i & 1)) {
                this.f6077a = list;
            } else {
                PluginExceptionsKt.b(CardsTypeInfoApiResponse$Unknown$$serializer.f6078a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.ncmc.data.apiresponsemodel.CardsTypeInfoApiResponse
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF6077a() {
            return this.f6077a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.d(this.f6077a, ((Unknown) obj).f6077a);
        }

        public final int hashCode() {
            return this.f6077a.hashCode();
        }

        public final String toString() {
            return r1.d("Unknown(cardList=", ")", this.f6077a);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract List getF6077a();
}
