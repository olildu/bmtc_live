package app.chalo.ncmc.data.appmodel;

import defpackage.r1;
import defpackage.sf;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel;", "", "Companion", "Semiclosed", "Closed", "Open", "Unknown", "Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Closed;", "Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Open;", "Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Semiclosed;", "Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Unknown;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class CardsTypeInfoAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6118a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(9));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<CardsTypeInfoAppModel> serializer() {
            return (KSerializer) CardsTypeInfoAppModel.f6118a.getValue();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract List getB();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Closed;", "Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Closed extends CardsTypeInfoAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(10))};
        public final List b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Closed$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Closed;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Closed> serializer() {
                return CardsTypeInfoAppModel$Closed$$serializer.f6119a;
            }
        }

        public /* synthetic */ Closed(int i, List list) {
            if (1 == (i & 1)) {
                this.b = list;
            } else {
                PluginExceptionsKt.b(CardsTypeInfoAppModel$Closed$$serializer.f6119a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.ncmc.data.appmodel.CardsTypeInfoAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Closed) && Intrinsics.d(this.b, ((Closed) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return r1.d("Closed(cardInfoList=", ")", this.b);
        }

        public Closed(ArrayList arrayList) {
            this.b = arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Open;", "Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Open extends CardsTypeInfoAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(11))};
        public final List b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Open$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Open;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Open> serializer() {
                return CardsTypeInfoAppModel$Open$$serializer.f6120a;
            }
        }

        public /* synthetic */ Open(int i, List list) {
            if (1 == (i & 1)) {
                this.b = list;
            } else {
                PluginExceptionsKt.b(CardsTypeInfoAppModel$Open$$serializer.f6120a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.ncmc.data.appmodel.CardsTypeInfoAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Open) && Intrinsics.d(this.b, ((Open) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return r1.d("Open(cardInfoList=", ")", this.b);
        }

        public Open(ArrayList arrayList) {
            this.b = arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Semiclosed;", "Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Semiclosed extends CardsTypeInfoAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(12))};
        public final List b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Semiclosed$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Semiclosed;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Semiclosed> serializer() {
                return CardsTypeInfoAppModel$Semiclosed$$serializer.f6121a;
            }
        }

        public /* synthetic */ Semiclosed(int i, List list) {
            if (1 == (i & 1)) {
                this.b = list;
            } else {
                PluginExceptionsKt.b(CardsTypeInfoAppModel$Semiclosed$$serializer.f6121a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.ncmc.data.appmodel.CardsTypeInfoAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Semiclosed) && Intrinsics.d(this.b, ((Semiclosed) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return r1.d("Semiclosed(cardInfoList=", ")", this.b);
        }

        public Semiclosed(ArrayList arrayList) {
            this.b = arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Unknown;", "Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Unknown extends CardsTypeInfoAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(13))};
        public final List b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Unknown$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/CardsTypeInfoAppModel$Unknown;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Unknown> serializer() {
                return CardsTypeInfoAppModel$Unknown$$serializer.f6122a;
            }
        }

        public /* synthetic */ Unknown(int i, List list) {
            if (1 == (i & 1)) {
                this.b = list;
            } else {
                PluginExceptionsKt.b(CardsTypeInfoAppModel$Unknown$$serializer.f6122a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.ncmc.data.appmodel.CardsTypeInfoAppModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.d(this.b, ((Unknown) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return r1.d("Unknown(cardInfoList=", ")", this.b);
        }

        public Unknown(ArrayList arrayList) {
            this.b = arrayList;
        }
    }
}
