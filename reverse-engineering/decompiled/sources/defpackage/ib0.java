package defpackage;

import app.chalo.onboarding.languageselection.LanguageSelectionDataState;
import app.chalo.onboarding.languageselection.LanguageSelectionSnackbarType;
import app.chalo.onboarding.migration.IosMigrationRequirement;
import io.github.alexzhirkevich.keight.js.JSError;
import io.github.alexzhirkevich.keight.js.RegexOptions;
import io.ktor.serialization.kotlinx.json.JsonSupportKt;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.internal.StringOpsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ib0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15898a;

    public /* synthetic */ ib0(int i) {
        this.f15898a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15898a;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("instant_ticket_receipt_table");
                return unit;
            case 1:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("instant_ticket_table");
                return unit;
            case 2:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("instant_ticket_table");
                return unit;
            case 3:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("instant_ticket_table");
                return unit;
            case 4:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("instant_ticket_table");
                return unit;
            case 5:
                Function1 emit6 = (Function1) obj;
                Intrinsics.i(emit6, "emit");
                emit6.invoke("instant_ticket_table");
                return unit;
            case 6:
                Function1 emit7 = (Function1) obj;
                Intrinsics.i(emit7, "emit");
                emit7.invoke("instant_ticket_table");
                return unit;
            case 7:
                IosMigrationRequirement it = (IosMigrationRequirement) obj;
                Intrinsics.i(it, "it");
                return it.name();
            case 8:
                IosMigrationRequirement it2 = (IosMigrationRequirement) obj;
                Intrinsics.i(it2, "it");
                return it2.name();
            case 9:
                return ((IosMigrationRequirement) obj).name();
            case 10:
                return new JSError(obj, (Throwable) null, 6);
            case 11:
                Map.Entry it3 = (Map.Entry) obj;
                Intrinsics.i(it3, "it");
                return CollectionsKt.S(it3.getKey(), it3.getValue());
            case 12:
                RegexOptions it4 = (RegexOptions) obj;
                Intrinsics.i(it4, "it");
                return String.valueOf(it4.getChar());
            case 13:
                ClassSerialDescriptorBuilder buildSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f18193a;
                Intrinsics.i(buildSerialDescriptor, "$this$buildSerialDescriptor");
                final ea0 ea0Var = new ea0(29);
                ClassSerialDescriptorBuilder.b(buildSerialDescriptor, "JsonPrimitive", new SerialDescriptor(ea0Var) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Lazy f18194a;

                    {
                        this.f18194a = LazyKt.b(ea0Var);
                    }

                    public final SerialDescriptor a() {
                        return (SerialDescriptor) this.f18194a.getValue();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean b() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int c(String name) {
                        Intrinsics.i(name, "name");
                        return a().c(name);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor d(int i5) {
                        return a().d(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: e */
                    public final int getC() {
                        return a().getC();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String f(int i5) {
                        return a().f(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List g(int i5) {
                        return a().g(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: getAnnotations */
                    public final List getD() {
                        return EmptyList.f17557a;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: getKind */
                    public final SerialKind getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: h */
                    public final String getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean i(int i5) {
                        return a().i(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: isInline */
                    public final boolean getM() {
                        return false;
                    }
                });
                final uc0 uc0Var = new uc0(i3);
                ClassSerialDescriptorBuilder.b(buildSerialDescriptor, "JsonNull", new SerialDescriptor(uc0Var) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Lazy f18194a;

                    {
                        this.f18194a = LazyKt.b(uc0Var);
                    }

                    public final SerialDescriptor a() {
                        return (SerialDescriptor) this.f18194a.getValue();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean b() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int c(String name) {
                        Intrinsics.i(name, "name");
                        return a().c(name);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor d(int i5) {
                        return a().d(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: e */
                    public final int getC() {
                        return a().getC();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String f(int i5) {
                        return a().f(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List g(int i5) {
                        return a().g(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: getAnnotations */
                    public final List getD() {
                        return EmptyList.f17557a;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: getKind */
                    public final SerialKind getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: h */
                    public final String getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean i(int i5) {
                        return a().i(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: isInline */
                    public final boolean getM() {
                        return false;
                    }
                });
                final a aVar = new a();
                ClassSerialDescriptorBuilder.b(buildSerialDescriptor, "JsonLiteral", new SerialDescriptor(aVar) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Lazy f18194a;

                    {
                        this.f18194a = LazyKt.b(aVar);
                    }

                    public final SerialDescriptor a() {
                        return (SerialDescriptor) this.f18194a.getValue();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean b() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int c(String name) {
                        Intrinsics.i(name, "name");
                        return a().c(name);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor d(int i5) {
                        return a().d(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: e */
                    public final int getC() {
                        return a().getC();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String f(int i5) {
                        return a().f(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List g(int i5) {
                        return a().g(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: getAnnotations */
                    public final List getD() {
                        return EmptyList.f17557a;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: getKind */
                    public final SerialKind getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: h */
                    public final String getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean i(int i5) {
                        return a().i(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: isInline */
                    public final boolean getM() {
                        return false;
                    }
                });
                final uc0 uc0Var2 = new uc0(i4);
                ClassSerialDescriptorBuilder.b(buildSerialDescriptor, "JsonObject", new SerialDescriptor(uc0Var2) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Lazy f18194a;

                    {
                        this.f18194a = LazyKt.b(uc0Var2);
                    }

                    public final SerialDescriptor a() {
                        return (SerialDescriptor) this.f18194a.getValue();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean b() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int c(String name) {
                        Intrinsics.i(name, "name");
                        return a().c(name);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor d(int i5) {
                        return a().d(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: e */
                    public final int getC() {
                        return a().getC();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String f(int i5) {
                        return a().f(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List g(int i5) {
                        return a().g(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: getAnnotations */
                    public final List getD() {
                        return EmptyList.f17557a;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: getKind */
                    public final SerialKind getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: h */
                    public final String getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean i(int i5) {
                        return a().i(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: isInline */
                    public final boolean getM() {
                        return false;
                    }
                });
                final uc0 uc0Var3 = new uc0(i2);
                ClassSerialDescriptorBuilder.b(buildSerialDescriptor, "JsonArray", new SerialDescriptor(uc0Var3) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Lazy f18194a;

                    {
                        this.f18194a = LazyKt.b(uc0Var3);
                    }

                    public final SerialDescriptor a() {
                        return (SerialDescriptor) this.f18194a.getValue();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean b() {
                        return false;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int c(String name) {
                        Intrinsics.i(name, "name");
                        return a().c(name);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor d(int i5) {
                        return a().d(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: e */
                    public final int getC() {
                        return a().getC();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String f(int i5) {
                        return a().f(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List g(int i5) {
                        return a().g(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: getAnnotations */
                    public final List getD() {
                        return EmptyList.f17557a;
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: getKind */
                    public final SerialKind getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: h */
                    public final String getB() {
                        return a().getB();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean i(int i5) {
                        return a().i(i5);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    /* JADX INFO: renamed from: isInline */
                    public final boolean getM() {
                        return false;
                    }
                });
                return unit;
            case 14:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.i(entry, "<destruct>");
                String str = (String) entry.getKey();
                JsonElement jsonElement = (JsonElement) entry.getValue();
                StringBuilder sb = new StringBuilder();
                StringOpsKt.a(str, sb);
                sb.append(':');
                sb.append(jsonElement);
                return sb.toString();
            case 15:
                JsonBuilder Json = (JsonBuilder) obj;
                int i5 = JsonSupportKt.f16877a;
                Intrinsics.i(Json, "$this$Json");
                Json.f18189a = true;
                Json.d = true;
                Json.l = true;
                Json.m = true;
                Json.e = false;
                return unit;
            case 16:
                Function1 emit8 = (Function1) obj;
                Intrinsics.i(emit8, "emit");
                emit8.invoke("keystorage");
                return unit;
            case 17:
                Function1 emit9 = (Function1) obj;
                Intrinsics.i(emit9, "emit");
                emit9.invoke("keystorage");
                return unit;
            case 18:
                Function1 emit10 = (Function1) obj;
                Intrinsics.i(emit10, "emit");
                emit10.invoke("keystorage");
                return unit;
            case 19:
                Function1 emit11 = (Function1) obj;
                Intrinsics.i(emit11, "emit");
                emit11.invoke("keystorage");
                return unit;
            case 20:
                LanguageSelectionDataState it5 = (LanguageSelectionDataState) obj;
                Intrinsics.i(it5, "it");
                return LanguageSelectionDataState.a(it5, true, null, false, false, null, null, null, null, 254);
            case 21:
                LanguageSelectionDataState it6 = (LanguageSelectionDataState) obj;
                Intrinsics.i(it6, "it");
                return LanguageSelectionDataState.a(it6, false, LanguageSelectionSnackbarType.None.f6661a, false, false, null, null, null, null, 253);
            case 22:
                LanguageSelectionDataState it7 = (LanguageSelectionDataState) obj;
                Intrinsics.i(it7, "it");
                return LanguageSelectionDataState.a(it7, false, LanguageSelectionSnackbarType.None.f6661a, false, false, null, null, null, null, 253);
            case 23:
                LanguageSelectionDataState it8 = (LanguageSelectionDataState) obj;
                Intrinsics.i(it8, "it");
                return LanguageSelectionDataState.a(it8, true, null, false, false, null, null, null, null, 254);
            case 24:
                LanguageSelectionDataState it9 = (LanguageSelectionDataState) obj;
                Intrinsics.i(it9, "it");
                return LanguageSelectionDataState.a(it9, false, null, false, false, null, null, null, null, 254);
            case 25:
                LanguageSelectionDataState it10 = (LanguageSelectionDataState) obj;
                Intrinsics.i(it10, "it");
                return LanguageSelectionDataState.a(it10, false, null, false, false, null, null, null, null, 254);
            case 26:
                LanguageSelectionDataState it11 = (LanguageSelectionDataState) obj;
                Intrinsics.i(it11, "it");
                return LanguageSelectionDataState.a(it11, false, null, false, false, null, null, null, null, 254);
            case 27:
                return LanguageSelectionDataState.a((LanguageSelectionDataState) obj, false, LanguageSelectionSnackbarType.LanguageDownloadFailed.f6660a, false, false, null, null, null, null, 253);
            case 28:
                return LanguageSelectionDataState.a((LanguageSelectionDataState) obj, false, LanguageSelectionSnackbarType.None.f6661a, false, false, null, null, null, null, 253);
            default:
                Function1 emit12 = (Function1) obj;
                Intrinsics.i(emit12, "emit");
                emit12.invoke("last_ride_info_table");
                return unit;
        }
    }
}
